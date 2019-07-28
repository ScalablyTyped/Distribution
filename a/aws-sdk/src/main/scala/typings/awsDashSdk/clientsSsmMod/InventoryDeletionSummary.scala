package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryDeletionSummary extends js.Object {
  /**
    * Remaining number of items to delete.
    */
  var RemainingCount: js.UndefOr[typings.awsDashSdk.clientsSsmMod.RemainingCount] = js.undefined
  /**
    * A list of counts and versions for deleted items.
    */
  var SummaryItems: js.UndefOr[InventoryDeletionSummaryItems] = js.undefined
  /**
    * The total number of items to delete. This count does not change during the delete operation.
    */
  var TotalCount: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TotalCount] = js.undefined
}

object InventoryDeletionSummary {
  @scala.inline
  def apply(
    RemainingCount: js.UndefOr[RemainingCount] = js.undefined,
    SummaryItems: InventoryDeletionSummaryItems = null,
    TotalCount: js.UndefOr[TotalCount] = js.undefined
  ): InventoryDeletionSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(RemainingCount)) __obj.updateDynamic("RemainingCount")(RemainingCount)
    if (SummaryItems != null) __obj.updateDynamic("SummaryItems")(SummaryItems)
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount)
    __obj.asInstanceOf[InventoryDeletionSummary]
  }
}

