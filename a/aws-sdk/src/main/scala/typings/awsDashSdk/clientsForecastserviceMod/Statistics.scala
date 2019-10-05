package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statistics extends js.Object {
  /**
    * For a numeric field, the average value in the field.
    */
  var Avg: js.UndefOr[Double] = js.undefined
  /**
    * The number of values in the field.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  /**
    * The number of distinct values in the field.
    */
  var CountDistinct: js.UndefOr[Integer] = js.undefined
  /**
    * The number of NAN (not a number) values in the field.
    */
  var CountNan: js.UndefOr[Integer] = js.undefined
  /**
    * The number of null values in the field.
    */
  var CountNull: js.UndefOr[Integer] = js.undefined
  /**
    * For a numeric field, the maximum value in the field.
    */
  var Max: js.UndefOr[String] = js.undefined
  /**
    * For a numeric field, the minimum value in the field.
    */
  var Min: js.UndefOr[String] = js.undefined
  /**
    * For a numeric field, the standard deviation.
    */
  var Stddev: js.UndefOr[Double] = js.undefined
}

object Statistics {
  @scala.inline
  def apply(
    Avg: Int | scala.Double = null,
    Count: Int | scala.Double = null,
    CountDistinct: Int | scala.Double = null,
    CountNan: Int | scala.Double = null,
    CountNull: Int | scala.Double = null,
    Max: String = null,
    Min: String = null,
    Stddev: Int | scala.Double = null
  ): Statistics = {
    val __obj = js.Dynamic.literal()
    if (Avg != null) __obj.updateDynamic("Avg")(Avg.asInstanceOf[js.Any])
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (CountDistinct != null) __obj.updateDynamic("CountDistinct")(CountDistinct.asInstanceOf[js.Any])
    if (CountNan != null) __obj.updateDynamic("CountNan")(CountNan.asInstanceOf[js.Any])
    if (CountNull != null) __obj.updateDynamic("CountNull")(CountNull.asInstanceOf[js.Any])
    if (Max != null) __obj.updateDynamic("Max")(Max)
    if (Min != null) __obj.updateDynamic("Min")(Min)
    if (Stddev != null) __obj.updateDynamic("Stddev")(Stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistics]
  }
}

