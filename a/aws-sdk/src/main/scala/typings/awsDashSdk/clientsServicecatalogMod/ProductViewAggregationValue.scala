package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductViewAggregationValue extends js.Object {
  /**
    * An approximate count of the products that match the value.
    */
  var ApproximateCount: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ApproximateCount] = js.undefined
  /**
    * The value of the product view aggregation.
    */
  var Value: js.UndefOr[AttributeValue] = js.undefined
}

object ProductViewAggregationValue {
  @scala.inline
  def apply(ApproximateCount: Int | Double = null, Value: AttributeValue = null): ProductViewAggregationValue = {
    val __obj = js.Dynamic.literal()
    if (ApproximateCount != null) __obj.updateDynamic("ApproximateCount")(ApproximateCount.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ProductViewAggregationValue]
  }
}

