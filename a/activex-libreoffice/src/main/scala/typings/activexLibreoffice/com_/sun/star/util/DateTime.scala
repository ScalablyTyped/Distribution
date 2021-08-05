package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a combined date+time value. */
trait DateTime extends StObject {
  
  /** is the day of month (1-31 or 0 for a void date). */
  var Day: Double
  
  /** contains the hour (0-23). */
  var Hours: Double
  
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: Boolean
  
  /** contains the minutes (0-59). */
  var Minutes: Double
  
  /** is the month of year (1-12 or 0 for a void date). */
  var Month: Double
  
  /** contains the nanoseconds (0 - 999 999 999). */
  var NanoSeconds: Double
  
  /** contains the seconds (0-59). */
  var Seconds: Double
  
  /** is the year. */
  var Year: Double
}
object DateTime {
  
  inline def apply(
    Day: Double,
    Hours: Double,
    IsUTC: Boolean,
    Minutes: Double,
    Month: Double,
    NanoSeconds: Double,
    Seconds: Double,
    Year: Double
  ): DateTime = {
    val __obj = js.Dynamic.literal(Day = Day.asInstanceOf[js.Any], Hours = Hours.asInstanceOf[js.Any], IsUTC = IsUTC.asInstanceOf[js.Any], Minutes = Minutes.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], NanoSeconds = NanoSeconds.asInstanceOf[js.Any], Seconds = Seconds.asInstanceOf[js.Any], Year = Year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTime]
  }
  
  extension [Self <: DateTime](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "Day", value.asInstanceOf[js.Any])
    
    inline def setHours(value: Double): Self = StObject.set(x, "Hours", value.asInstanceOf[js.Any])
    
    inline def setIsUTC(value: Boolean): Self = StObject.set(x, "IsUTC", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "Minutes", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "Month", value.asInstanceOf[js.Any])
    
    inline def setNanoSeconds(value: Double): Self = StObject.set(x, "NanoSeconds", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "Seconds", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "Year", value.asInstanceOf[js.Any])
  }
}
