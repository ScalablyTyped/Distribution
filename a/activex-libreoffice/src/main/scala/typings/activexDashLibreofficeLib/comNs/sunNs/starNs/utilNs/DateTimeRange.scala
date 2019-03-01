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

object DateTimeRange {
  @scala.inline
  def apply(
    EndDay: scala.Double,
    EndHours: scala.Double,
    EndMinutes: scala.Double,
    EndMonth: scala.Double,
    EndNanoSeconds: scala.Double,
    EndSeconds: scala.Double,
    EndYear: scala.Double,
    IsUTC: scala.Boolean,
    StartDay: scala.Double,
    StartHours: scala.Double,
    StartMinutes: scala.Double,
    StartMonth: scala.Double,
    StartNanoSeconds: scala.Double,
    StartSeconds: scala.Double,
    StartYear: scala.Double
  ): DateTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EndDay")(EndDay)
    __obj.updateDynamic("EndHours")(EndHours)
    __obj.updateDynamic("EndMinutes")(EndMinutes)
    __obj.updateDynamic("EndMonth")(EndMonth)
    __obj.updateDynamic("EndNanoSeconds")(EndNanoSeconds)
    __obj.updateDynamic("EndSeconds")(EndSeconds)
    __obj.updateDynamic("EndYear")(EndYear)
    __obj.updateDynamic("IsUTC")(IsUTC)
    __obj.updateDynamic("StartDay")(StartDay)
    __obj.updateDynamic("StartHours")(StartHours)
    __obj.updateDynamic("StartMinutes")(StartMinutes)
    __obj.updateDynamic("StartMonth")(StartMonth)
    __obj.updateDynamic("StartNanoSeconds")(StartNanoSeconds)
    __obj.updateDynamic("StartSeconds")(StartSeconds)
    __obj.updateDynamic("StartYear")(StartYear)
    __obj.asInstanceOf[DateTimeRange]
  }
}

