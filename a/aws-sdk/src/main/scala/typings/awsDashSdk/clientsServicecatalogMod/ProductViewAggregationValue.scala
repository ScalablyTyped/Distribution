package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductViewAggregationValue extends js.Object {
  /**
    * An approximate count of the products that match the value.
    */
  var ApproximateCount: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ApproximateCount] = js.native
  /**
    * The value of the product view aggregation.
    */
  var Value: js.UndefOr[AttributeValue] = js.native
}

object ProductViewAggregationValue {
  @scala.inline
  def apply(ApproximateCount: Int | Double = null, Value: AttributeValue = null): ProductViewAggregationValue = {
    val __obj = js.Dynamic.literal()
    if (ApproximateCount != null) __obj.updateDynamic("ApproximateCount")(ApproximateCount.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductViewAggregationValue]
  }
}

