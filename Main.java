
import java.util.Scanner;	

public class Main
{
	public static void main(String[] args)
	{
		// Initialization for the scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Declare variables that would be needed
		int noOfDays = 0;
    int day = 0;
		double sum = 0.0;
    double max = 0.0;
    double min = 0.0;
    double average = 0.0;
		
		// Read the number of days from the user
		System.out.print("How many days does the month have? ");
		noOfDays = keyboard.nextInt();
		keyboard.nextLine(); // Clear the input buffer
		
		// Initialize variables
		sum =  0.0;
		max = Integer.MIN_VALUE; //Store max value
		min = Integer.MAX_VALUE; //Store min value
		
		
		// Processing and Calculating

    for (day = 1; day <= noOfDays; day ++)
    {
      //enter temp for day
      System.out.print("Enter temp for day" + day + ":");
      double temp = keyboard.nextDouble();
      keyboard.nextLine(); //clear buffer

      //add temp to sum
      sum = sum + temp;

      //is the temp lower than lowest temp?
      if (temp < min)
      {
        min = temp; //new min temp
      }
      //is temp higher than max temp? 
      if (temp > max)
      {
        max = temp; //new max temp
      }
    }


    //calculate average
    average = sum / noOfDays;
		
				
		// // Printing with two decimal places
		System.out.println("The highest temperature was " + max + "°C\n");
    System.out.printf("The lowest temperature was " + min + "°C\n");
    System.out.printf("Average temperature was " + average + "°C\n");
    keyboard.close();
	}
}