package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDeletionSummary extends js.Object {
  /**
    * Remaining number of items to delete.
    */
  var RemainingCount: js.UndefOr[typings.awsDashSdk.clientsSsmMod.RemainingCount] = js.native
  /**
    * A list of counts and versions for deleted items.
    */
  var SummaryItems: js.UndefOr[InventoryDeletionSummaryItems] = js.native
  /**
    * The total number of items to delete. This count does not change during the delete operation.
    */
  var TotalCount: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TotalCount] = js.native
}

object InventoryDeletionSummary {
  @scala.inline
  def apply(
    RemainingCount: Int | Double = null,
    SummaryItems: InventoryDeletionSummaryItems = null,
    TotalCount: Int | Double = null
  ): InventoryDeletionSummary = {
    val __obj = js.Dynamic.literal()
    if (RemainingCount != null) __obj.updateDynamic("RemainingCount")(RemainingCount.asInstanceOf[js.Any])
    if (SummaryItems != null) __obj.updateDynamic("SummaryItems")(SummaryItems.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDeletionSummary]
  }
}

