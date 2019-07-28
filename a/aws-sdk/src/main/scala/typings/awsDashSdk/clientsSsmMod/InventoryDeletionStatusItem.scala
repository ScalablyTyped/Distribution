package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryDeletionStatusItem extends js.Object {
  /**
    * The deletion ID returned by the DeleteInventory action.
    */
  var DeletionId: js.UndefOr[InventoryDeletionId] = js.undefined
  /**
    * The UTC timestamp when the delete operation started.
    */
  var DeletionStartTime: js.UndefOr[InventoryDeletionStartTime] = js.undefined
  /**
    * Information about the delete operation. For more information about this summary, see Understanding the Delete Inventory Summary in the AWS Systems Manager User Guide.
    */
  var DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.undefined
  /**
    * The status of the operation. Possible values are InProgress and Complete.
    */
  var LastStatus: js.UndefOr[InventoryDeletionStatus] = js.undefined
  /**
    * Information about the status.
    */
  var LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage] = js.undefined
  /**
    * The UTC timestamp of when the last status report.
    */
  var LastStatusUpdateTime: js.UndefOr[InventoryDeletionLastStatusUpdateTime] = js.undefined
  /**
    * The name of the inventory data type.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
}

object InventoryDeletionStatusItem {
  @scala.inline
  def apply(
    DeletionId: InventoryDeletionId = null,
    DeletionStartTime: InventoryDeletionStartTime = null,
    DeletionSummary: InventoryDeletionSummary = null,
    LastStatus: InventoryDeletionStatus = null,
    LastStatusMessage: InventoryDeletionLastStatusMessage = null,
    LastStatusUpdateTime: InventoryDeletionLastStatusUpdateTime = null,
    TypeName: InventoryItemTypeName = null
  ): InventoryDeletionStatusItem = {
    val __obj = js.Dynamic.literal()
    if (DeletionId != null) __obj.updateDynamic("DeletionId")(DeletionId)
    if (DeletionStartTime != null) __obj.updateDynamic("DeletionStartTime")(DeletionStartTime)
    if (DeletionSummary != null) __obj.updateDynamic("DeletionSummary")(DeletionSummary)
    if (LastStatus != null) __obj.updateDynamic("LastStatus")(LastStatus.asInstanceOf[js.Any])
    if (LastStatusMessage != null) __obj.updateDynamic("LastStatusMessage")(LastStatusMessage)
    if (LastStatusUpdateTime != null) __obj.updateDynamic("LastStatusUpdateTime")(LastStatusUpdateTime)
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName)
    __obj.asInstanceOf[InventoryDeletionStatusItem]
  }
}

