package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

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
  var Days: scala.Double
  /** contains the hours. */
  var Hours: scala.Double
  /** contains the minutes. */
  var Minutes: scala.Double
  /** contains the months. */
  var Months: scala.Double
  /** contains the nanoseconds. */
  var NanoSeconds: scala.Double
  /** explicit sign bit. */
  var Negative: scala.Boolean
  /** contains the seconds. */
  var Seconds: scala.Double
  /** contains the years. */
  var Years: scala.Double
}

