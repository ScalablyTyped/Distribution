package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a date value.
  *
  * The time zone is unknown.
  */
trait Date extends StObject {
  
  /** contains the day of month (1-31 or 0 for a void date). */
  var Day: Double
  
  /** contains the month of year (1-12 or 0 for a void date). */
  var Month: Double
  
  /** contains the year. */
  var Year: Double
}
object Date {
  
  @scala.inline
  def apply(Day: Double, Month: Double, Year: Double): Date = {
    val __obj = js.Dynamic.literal(Day = Day.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], Year = Year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "Day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "Month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "Year", value.asInstanceOf[js.Any])
  }
}
