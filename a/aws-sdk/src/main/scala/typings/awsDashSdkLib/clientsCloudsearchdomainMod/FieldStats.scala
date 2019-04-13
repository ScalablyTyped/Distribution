package typings
package awsDashSdkLib.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldStats extends js.Object {
  /**
    * The number of documents that contain a value in the specified field in the result set.
    */
  var count: js.UndefOr[Long] = js.undefined
  /**
    * The maximum value found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), max is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, max is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var max: js.UndefOr[String] = js.undefined
  /**
    * The average of the values found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), mean is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, mean is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var mean: js.UndefOr[String] = js.undefined
  /**
    * The minimum value found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), min is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, min is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var min: js.UndefOr[String] = js.undefined
  /**
    * The number of documents that do not contain a value in the specified field in the result set.
    */
  var missing: js.UndefOr[Long] = js.undefined
  /**
    * The standard deviation of the values in the specified field in the result set.
    */
  var stddev: js.UndefOr[Double] = js.undefined
  /**
    * The sum of the field values across the documents in the result set. null for date fields.
    */
  var sum: js.UndefOr[Double] = js.undefined
  /**
    * The sum of all field values in the result set squared.
    */
  var sumOfSquares: js.UndefOr[Double] = js.undefined
}

object FieldStats {
  @scala.inline
  def apply(
    count: js.UndefOr[Long] = js.undefined,
    max: String = null,
    mean: String = null,
    min: String = null,
    missing: js.UndefOr[Long] = js.undefined,
    stddev: js.UndefOr[Double] = js.undefined,
    sum: js.UndefOr[Double] = js.undefined,
    sumOfSquares: js.UndefOr[Double] = js.undefined
  ): FieldStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    if (max != null) __obj.updateDynamic("max")(max)
    if (mean != null) __obj.updateDynamic("mean")(mean)
    if (min != null) __obj.updateDynamic("min")(min)
    if (!js.isUndefined(missing)) __obj.updateDynamic("missing")(missing)
    if (!js.isUndefined(stddev)) __obj.updateDynamic("stddev")(stddev)
    if (!js.isUndefined(sum)) __obj.updateDynamic("sum")(sum)
    if (!js.isUndefined(sumOfSquares)) __obj.updateDynamic("sumOfSquares")(sumOfSquares)
    __obj.asInstanceOf[FieldStats]
  }
}

