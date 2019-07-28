package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

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
trait Duration extends js.Object {
  /** contains the days. */
  var Days: Double
  /** contains the hours. */
  var Hours: Double
  /** contains the minutes. */
  var Minutes: Double
  /** contains the months. */
  var Months: Double
  /** contains the nanoseconds. */
  var NanoSeconds: Double
  /** explicit sign bit. */
  var Negative: Boolean
  /** contains the seconds. */
  var Seconds: Double
  /** contains the years. */
  var Years: Double
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
    val __obj = js.Dynamic.literal(Days = Days, Hours = Hours, Minutes = Minutes, Months = Months, NanoSeconds = NanoSeconds, Negative = Negative, Seconds = Seconds, Years = Years)
  
    __obj.asInstanceOf[Duration]
  }
}

