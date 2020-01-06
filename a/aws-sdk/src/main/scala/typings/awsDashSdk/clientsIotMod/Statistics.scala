package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statistics extends js.Object {
  /**
    * The average of the aggregated field values.
    */
  var average: js.UndefOr[Average] = js.native
  /**
    * The count of things that match the query.
    */
  var count: js.UndefOr[Count] = js.native
  /**
    * The maximum aggregated field value.
    */
  var maximum: js.UndefOr[Maximum] = js.native
  /**
    * The minimum aggregated field value.
    */
  var minimum: js.UndefOr[Minimum] = js.native
  /**
    * The standard deviation of the aggregated field values.
    */
  var stdDeviation: js.UndefOr[StdDeviation] = js.native
  /**
    * The sum of the aggregated field values.
    */
  var sum: js.UndefOr[Sum] = js.native
  /**
    * The sum of the squares of the aggregated field values.
    */
  var sumOfSquares: js.UndefOr[SumOfSquares] = js.native
  /**
    * The variance of the aggregated field values.
    */
  var variance: js.UndefOr[Variance] = js.native
}

object Statistics {
  @scala.inline
  def apply(
    average: Int | Double = null,
    count: Int | Double = null,
    maximum: Int | Double = null,
    minimum: Int | Double = null,
    stdDeviation: Int | Double = null,
    sum: Int | Double = null,
    sumOfSquares: Int | Double = null,
    variance: Int | Double = null
  ): Statistics = {
    val __obj = js.Dynamic.literal()
    if (average != null) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (stdDeviation != null) __obj.updateDynamic("stdDeviation")(stdDeviation.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    if (sumOfSquares != null) __obj.updateDynamic("sumOfSquares")(sumOfSquares.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistics]
  }
}

