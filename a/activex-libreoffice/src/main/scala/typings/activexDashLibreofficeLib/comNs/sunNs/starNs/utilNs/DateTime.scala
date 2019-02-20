package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a combined date+time value. */
trait DateTime extends js.Object {
  /** is the day of month (1-31 or 0 for a void date). */
  var Day: scala.Double
  /** contains the hour (0-23). */
  var Hours: scala.Double
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: scala.Boolean
  /** contains the minutes (0-59). */
  var Minutes: scala.Double
  /** is the month of year (1-12 or 0 for a void date). */
  var Month: scala.Double
  /** contains the nanoseconds (0 - 999 999 999). */
  var NanoSeconds: scala.Double
  /** contains the seconds (0-59). */
  var Seconds: scala.Double
  /** is the year. */
  var Year: scala.Double
}

