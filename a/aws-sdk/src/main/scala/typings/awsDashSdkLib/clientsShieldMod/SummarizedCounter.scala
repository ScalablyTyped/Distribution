package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummarizedCounter extends js.Object {
  /**
    * The average value of the counter for a specified time period.
    */
  var Average: js.UndefOr[Double] = js.undefined
  /**
    * The maximum value of the counter for a specified time period.
    */
  var Max: js.UndefOr[Double] = js.undefined
  /**
    * The number of counters for a specified time period.
    */
  var N: js.UndefOr[Integer] = js.undefined
  /**
    * The counter name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The total of counter values for a specified time period.
    */
  var Sum: js.UndefOr[Double] = js.undefined
  /**
    * The unit of the counters.
    */
  var Unit: js.UndefOr[String] = js.undefined
}

object SummarizedCounter {
  @scala.inline
  def apply(
    Average: js.UndefOr[Double] = js.undefined,
    Max: js.UndefOr[Double] = js.undefined,
    N: js.UndefOr[Integer] = js.undefined,
    Name: String = null,
    Sum: js.UndefOr[Double] = js.undefined,
    Unit: String = null
  ): SummarizedCounter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Average)) __obj.updateDynamic("Average")(Average)
    if (!js.isUndefined(Max)) __obj.updateDynamic("Max")(Max)
    if (!js.isUndefined(N)) __obj.updateDynamic("N")(N)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Sum)) __obj.updateDynamic("Sum")(Sum)
    if (Unit != null) __obj.updateDynamic("Unit")(Unit)
    __obj.asInstanceOf[SummarizedCounter]
  }
}

