package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductViewAggregationValue extends js.Object {
  /**
    * An approximate count of the products that match the value.
    */
  var ApproximateCount: js.UndefOr[ApproximateCount] = js.undefined
  /**
    * The value of the product view aggregation.
    */
  var Value: js.UndefOr[AttributeValue] = js.undefined
}

object ProductViewAggregationValue {
  @scala.inline
  def apply(ApproximateCount: js.UndefOr[ApproximateCount] = js.undefined, Value: AttributeValue = null): ProductViewAggregationValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ApproximateCount)) __obj.updateDynamic("ApproximateCount")(ApproximateCount)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ProductViewAggregationValue]
  }
}

