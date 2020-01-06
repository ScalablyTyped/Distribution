package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryAggregator extends js.Object {
  /**
    * Nested aggregators to further refine aggregation for an inventory type.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.native
  /**
    * The inventory type and attribute name for aggregation.
    */
  var Expression: js.UndefOr[InventoryAggregatorExpression] = js.native
  /**
    * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.
    */
  var Groups: js.UndefOr[InventoryGroupList] = js.native
}

object InventoryAggregator {
  @scala.inline
  def apply(
    Aggregators: InventoryAggregatorList = null,
    Expression: InventoryAggregatorExpression = null,
    Groups: InventoryGroupList = null
  ): InventoryAggregator = {
    val __obj = js.Dynamic.literal()
    if (Aggregators != null) __obj.updateDynamic("Aggregators")(Aggregators.asInstanceOf[js.Any])
    if (Expression != null) __obj.updateDynamic("Expression")(Expression.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryAggregator]
  }
}

