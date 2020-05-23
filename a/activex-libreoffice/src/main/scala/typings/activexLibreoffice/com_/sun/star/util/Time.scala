package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a time value. */
trait Time extends js.Object {
  /** contains the hour (0-23). */
  var Hours: Double
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: Boolean
  /** contains the minutes (0-59). */
  var Minutes: Double
  /** contains the nanoseconds (0 - 999 999 999). */
  var NanoSeconds: Double
  /** contains the seconds (0-59). */
  var Seconds: Double
}

object Time {
  @scala.inline
  def apply(Hours: Double, IsUTC: Boolean, Minutes: Double, NanoSeconds: Double, Seconds: Double): Time = {
    val __obj = js.Dynamic.literal(Hours = Hours.asInstanceOf[js.Any], IsUTC = IsUTC.asInstanceOf[js.Any], Minutes = Minutes.asInstanceOf[js.Any], NanoSeconds = NanoSeconds.asInstanceOf[js.Any], Seconds = Seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
}

