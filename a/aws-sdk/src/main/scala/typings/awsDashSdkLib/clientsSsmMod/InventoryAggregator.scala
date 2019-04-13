package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryAggregator extends js.Object {
  /**
    * Nested aggregators to further refine aggregation for an inventory type.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined
  /**
    * The inventory type and attribute name for aggregation.
    */
  var Expression: js.UndefOr[InventoryAggregatorExpression] = js.undefined
  /**
    * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.
    */
  var Groups: js.UndefOr[InventoryGroupList] = js.undefined
}

object InventoryAggregator {
  @scala.inline
  def apply(
    Aggregators: InventoryAggregatorList = null,
    Expression: InventoryAggregatorExpression = null,
    Groups: InventoryGroupList = null
  ): InventoryAggregator = {
    val __obj = js.Dynamic.literal()
    if (Aggregators != null) __obj.updateDynamic("Aggregators")(Aggregators)
    if (Expression != null) __obj.updateDynamic("Expression")(Expression)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    __obj.asInstanceOf[InventoryAggregator]
  }
}

