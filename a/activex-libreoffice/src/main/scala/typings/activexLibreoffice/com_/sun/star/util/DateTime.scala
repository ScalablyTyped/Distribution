package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a combined date+time value. */
@js.native
trait DateTime extends StObject {
  
  /** is the day of month (1-31 or 0 for a void date). */
  var Day: Double = js.native
  
  /** contains the hour (0-23). */
  var Hours: Double = js.native
  
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: Boolean = js.native
  
  /** contains the minutes (0-59). */
  var Minutes: Double = js.native
  
  /** is the month of year (1-12 or 0 for a void date). */
  var Month: Double = js.native
  
  /** contains the nanoseconds (0 - 999 999 999). */
  var NanoSeconds: Double = js.native
  
  /** contains the seconds (0-59). */
  var Seconds: Double = js.native
  
  /** is the year. */
  var Year: Double = js.native
}
object DateTime {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DateTimeMutableBuilder[Self <: DateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "Day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHours(value: Double): Self = StObject.set(x, "Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUTC(value: Boolean): Self = StObject.set(x, "IsUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "Minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "Month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanoSeconds(value: Double): Self = StObject.set(x, "NanoSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Double): Self = StObject.set(x, "Seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "Year", value.asInstanceOf[js.Any])
  }
}
