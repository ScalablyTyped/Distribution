package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryDeletionSummaryItem extends js.Object {
  /**
    * A count of the number of deleted items.
    */
  var Count: js.UndefOr[ResourceCount] = js.undefined
  /**
    * The remaining number of items to delete.
    */
  var RemainingCount: js.UndefOr[typings.awsDashSdk.clientsSsmMod.RemainingCount] = js.undefined
  /**
    * The inventory type version.
    */
  var Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
}

object InventoryDeletionSummaryItem {
  @scala.inline
  def apply(
    Count: Int | Double = null,
    RemainingCount: Int | Double = null,
    Version: InventoryItemSchemaVersion = null
  ): InventoryDeletionSummaryItem = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (RemainingCount != null) __obj.updateDynamic("RemainingCount")(RemainingCount.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[InventoryDeletionSummaryItem]
  }
}

