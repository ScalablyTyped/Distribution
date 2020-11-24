package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a combined date+time value. */
@js.native
trait DateTime extends js.Object {
  
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
  implicit class DateTimeOps[Self <: DateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDay(value: Double): Self = this.set("Day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHours(value: Double): Self = this.set("Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUTC(value: Boolean): Self = this.set("IsUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutes(value: Double): Self = this.set("Minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("Month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanoSeconds(value: Double): Self = this.set("NanoSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Double): Self = this.set("Seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = this.set("Year", value.asInstanceOf[js.Any])
  }
}
