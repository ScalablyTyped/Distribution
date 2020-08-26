package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a duration.
  *
  * A duration is the difference of 2 DateTimes.
  *
  * Note that there are no constraints on the ranges of the members, except that every member must be non-negative: for example, a {@link Duration} of 400
  * Days is valid.
  * @since OOo 3.3
  */
@js.native
trait Duration extends js.Object {
  /** contains the days. */
  var Days: Double = js.native
  /** contains the hours. */
  var Hours: Double = js.native
  /** contains the minutes. */
  var Minutes: Double = js.native
  /** contains the months. */
  var Months: Double = js.native
  /** contains the nanoseconds. */
  var NanoSeconds: Double = js.native
  /** explicit sign bit. */
  var Negative: Boolean = js.native
  /** contains the seconds. */
  var Seconds: Double = js.native
  /** contains the years. */
  var Years: Double = js.native
}

object Duration {
  @scala.inline
  def apply(
    Days: Double,
    Hours: Double,
    Minutes: Double,
    Months: Double,
    NanoSeconds: Double,
    Negative: Boolean,
    Seconds: Double,
    Years: Double
  ): Duration = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Hours = Hours.asInstanceOf[js.Any], Minutes = Minutes.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], NanoSeconds = NanoSeconds.asInstanceOf[js.Any], Negative = Negative.asInstanceOf[js.Any], Seconds = Seconds.asInstanceOf[js.Any], Years = Years.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
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
    def setDays(value: Double): Self = this.set("Days", value.asInstanceOf[js.Any])
    @scala.inline
    def setHours(value: Double): Self = this.set("Hours", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinutes(value: Double): Self = this.set("Minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonths(value: Double): Self = this.set("Months", value.asInstanceOf[js.Any])
    @scala.inline
    def setNanoSeconds(value: Double): Self = this.set("NanoSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegative(value: Boolean): Self = this.set("Negative", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeconds(value: Double): Self = this.set("Seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setYears(value: Double): Self = this.set("Years", value.asInstanceOf[js.Any])
  }
  
}

