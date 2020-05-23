package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a range of date+time values. */
trait DateTimeRange extends js.Object {
  /** contains the end day of month (1-31 or 0 for a void date) for the range. */
  var EndDay: Double
  /** contains the end hour (0-23) for the range. */
  var EndHours: Double
  /** contains the end minutes (0-59) for the range. */
  var EndMinutes: Double
  /** contains the end month of year (1-12 or 0 for a void date) for the range. */
  var EndMonth: Double
  /** contains the end nanoseconds (0 - 999 999 999) for the range. */
  var EndNanoSeconds: Double
  /** contains the end seconds (0-59) for the range. */
  var EndSeconds: Double
  /** contains the end year for the range. */
  var EndYear: Double
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: Boolean
  /** contains the start day of month (1-31 or 0 for a void date) for the range. */
  var StartDay: Double
  /** contains the start hour (0-23) for the range. */
  var StartHours: Double
  /** contains the start minutes (0-59) for the range. */
  var StartMinutes: Double
  /** contains the start month of year (1-12 or 0 for a void date) for the range. */
  var StartMonth: Double
  /** contains the start nanoseconds (0 - 999 999 999) for the range. */
  var StartNanoSeconds: Double
  /** contains the start seconds (0-59) for the range. */
  var StartSeconds: Double
  /** contains the start year for the range. */
  var StartYear: Double
}

object DateTimeRange {
  @scala.inline
  def apply(
    EndDay: Double,
    EndHours: Double,
    EndMinutes: Double,
    EndMonth: Double,
    EndNanoSeconds: Double,
    EndSeconds: Double,
    EndYear: Double,
    IsUTC: Boolean,
    StartDay: Double,
    StartHours: Double,
    StartMinutes: Double,
    StartMonth: Double,
    StartNanoSeconds: Double,
    StartSeconds: Double,
    StartYear: Double
  ): DateTimeRange = {
    val __obj = js.Dynamic.literal(EndDay = EndDay.asInstanceOf[js.Any], EndHours = EndHours.asInstanceOf[js.Any], EndMinutes = EndMinutes.asInstanceOf[js.Any], EndMonth = EndMonth.asInstanceOf[js.Any], EndNanoSeconds = EndNanoSeconds.asInstanceOf[js.Any], EndSeconds = EndSeconds.asInstanceOf[js.Any], EndYear = EndYear.asInstanceOf[js.Any], IsUTC = IsUTC.asInstanceOf[js.Any], StartDay = StartDay.asInstanceOf[js.Any], StartHours = StartHours.asInstanceOf[js.Any], StartMinutes = StartMinutes.asInstanceOf[js.Any], StartMonth = StartMonth.asInstanceOf[js.Any], StartNanoSeconds = StartNanoSeconds.asInstanceOf[js.Any], StartSeconds = StartSeconds.asInstanceOf[js.Any], StartYear = StartYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeRange]
  }
}

