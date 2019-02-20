package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a range of date+time values. */
trait DateTimeRange extends js.Object {
  /** contains the end day of month (1-31 or 0 for a void date) for the range. */
  var EndDay: scala.Double
  /** contains the end hour (0-23) for the range. */
  var EndHours: scala.Double
  /** contains the end minutes (0-59) for the range. */
  var EndMinutes: scala.Double
  /** contains the end month of year (1-12 or 0 for a void date) for the range. */
  var EndMonth: scala.Double
  /** contains the end nanoseconds (0 - 999 999 999) for the range. */
  var EndNanoSeconds: scala.Double
  /** contains the end seconds (0-59) for the range. */
  var EndSeconds: scala.Double
  /** contains the end year for the range. */
  var EndYear: scala.Double
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: scala.Boolean
  /** contains the start day of month (1-31 or 0 for a void date) for the range. */
  var StartDay: scala.Double
  /** contains the start hour (0-23) for the range. */
  var StartHours: scala.Double
  /** contains the start minutes (0-59) for the range. */
  var StartMinutes: scala.Double
  /** contains the start month of year (1-12 or 0 for a void date) for the range. */
  var StartMonth: scala.Double
  /** contains the start nanoseconds (0 - 999 999 999) for the range. */
  var StartNanoSeconds: scala.Double
  /** contains the start seconds (0-59) for the range. */
  var StartSeconds: scala.Double
  /** contains the start year for the range. */
  var StartYear: scala.Double
}

