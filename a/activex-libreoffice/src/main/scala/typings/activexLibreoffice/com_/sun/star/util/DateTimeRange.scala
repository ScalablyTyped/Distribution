package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a range of date+time values. */
@js.native
trait DateTimeRange extends js.Object {
  /** contains the end day of month (1-31 or 0 for a void date) for the range. */
  var EndDay: Double = js.native
  /** contains the end hour (0-23) for the range. */
  var EndHours: Double = js.native
  /** contains the end minutes (0-59) for the range. */
  var EndMinutes: Double = js.native
  /** contains the end month of year (1-12 or 0 for a void date) for the range. */
  var EndMonth: Double = js.native
  /** contains the end nanoseconds (0 - 999 999 999) for the range. */
  var EndNanoSeconds: Double = js.native
  /** contains the end seconds (0-59) for the range. */
  var EndSeconds: Double = js.native
  /** contains the end year for the range. */
  var EndYear: Double = js.native
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: Boolean = js.native
  /** contains the start day of month (1-31 or 0 for a void date) for the range. */
  var StartDay: Double = js.native
  /** contains the start hour (0-23) for the range. */
  var StartHours: Double = js.native
  /** contains the start minutes (0-59) for the range. */
  var StartMinutes: Double = js.native
  /** contains the start month of year (1-12 or 0 for a void date) for the range. */
  var StartMonth: Double = js.native
  /** contains the start nanoseconds (0 - 999 999 999) for the range. */
  var StartNanoSeconds: Double = js.native
  /** contains the start seconds (0-59) for the range. */
  var StartSeconds: Double = js.native
  /** contains the start year for the range. */
  var StartYear: Double = js.native
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
  @scala.inline
  implicit class DateTimeRangeOps[Self <: DateTimeRange] (val x: Self) extends AnyVal {
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
    def setEndDay(value: Double): Self = this.set("EndDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndHours(value: Double): Self = this.set("EndHours", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndMinutes(value: Double): Self = this.set("EndMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndMonth(value: Double): Self = this.set("EndMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndNanoSeconds(value: Double): Self = this.set("EndNanoSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndSeconds(value: Double): Self = this.set("EndSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndYear(value: Double): Self = this.set("EndYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsUTC(value: Boolean): Self = this.set("IsUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDay(value: Double): Self = this.set("StartDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartHours(value: Double): Self = this.set("StartHours", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartMinutes(value: Double): Self = this.set("StartMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartMonth(value: Double): Self = this.set("StartMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartNanoSeconds(value: Double): Self = this.set("StartNanoSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartSeconds(value: Double): Self = this.set("StartSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartYear(value: Double): Self = this.set("StartYear", value.asInstanceOf[js.Any])
  }
  
}

