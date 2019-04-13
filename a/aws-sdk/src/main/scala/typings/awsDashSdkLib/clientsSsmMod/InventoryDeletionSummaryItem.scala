package typings
package awsDashSdkLib.clientsSsmMod

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
  var RemainingCount: js.UndefOr[RemainingCount] = js.undefined
  /**
    * The inventory type version.
    */
  var Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
}

object InventoryDeletionSummaryItem {
  @scala.inline
  def apply(
    Count: js.UndefOr[ResourceCount] = js.undefined,
    RemainingCount: js.UndefOr[RemainingCount] = js.undefined,
    Version: InventoryItemSchemaVersion = null
  ): InventoryDeletionSummaryItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count)
    if (!js.isUndefined(RemainingCount)) __obj.updateDynamic("RemainingCount")(RemainingCount)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[InventoryDeletionSummaryItem]
  }
}

