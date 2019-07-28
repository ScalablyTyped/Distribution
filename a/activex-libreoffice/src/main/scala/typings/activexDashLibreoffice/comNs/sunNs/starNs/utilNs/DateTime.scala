package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a combined date+time value. */
trait DateTime extends js.Object {
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
    val __obj = js.Dynamic.literal(Day = Day, Hours = Hours, IsUTC = IsUTC, Minutes = Minutes, Month = Month, NanoSeconds = NanoSeconds, Seconds = Seconds, Year = Year)
  
    __obj.asInstanceOf[DateTime]
  }
}

