package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDimension extends js.Object {
  /**
    * The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN, GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
    */
  var ComparisonOperator: js.UndefOr[__string] = js.undefined
  /**
    * The value to be compared.
    */
  var Value: js.UndefOr[__double] = js.undefined
}

object MetricDimension {
  @scala.inline
  def apply(ComparisonOperator: __string = null, Value: js.UndefOr[__double] = js.undefined): MetricDimension = {
    val __obj = js.Dynamic.literal()
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator)
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[MetricDimension]
  }
}

