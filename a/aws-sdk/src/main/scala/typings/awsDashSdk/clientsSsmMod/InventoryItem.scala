package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItem extends js.Object {
  /**
    * The time the inventory information was collected.
    */
  var CaptureTime: InventoryItemCaptureTime
  /**
    * The inventory data of the inventory type.
    */
  var Content: js.UndefOr[InventoryItemEntryList] = js.undefined
  /**
    * MD5 hash of the inventory item type contents. The content hash is used to determine whether to update inventory information. The PutInventory API does not update the inventory item type contents if the MD5 hash has not changed since last update. 
    */
  var ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined
  /**
    * A map of associated properties for a specified inventory type. For example, with this attribute, you can specify the ExecutionId, ExecutionType, ComplianceType properties of the AWS:ComplianceItem type.
    */
  var Context: js.UndefOr[InventoryItemContentContext] = js.undefined
  /**
    * The schema version for the inventory item.
    */
  var SchemaVersion: InventoryItemSchemaVersion
  /**
    * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application, AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
    */
  var TypeName: InventoryItemTypeName
}

object InventoryItem {
  @scala.inline
  def apply(
    CaptureTime: InventoryItemCaptureTime,
    SchemaVersion: InventoryItemSchemaVersion,
    TypeName: InventoryItemTypeName,
    Content: InventoryItemEntryList = null,
    ContentHash: InventoryItemContentHash = null,
    Context: InventoryItemContentContext = null
  ): InventoryItem = {
    val __obj = js.Dynamic.literal(CaptureTime = CaptureTime, SchemaVersion = SchemaVersion, TypeName = TypeName)
    if (Content != null) __obj.updateDynamic("Content")(Content)
    if (ContentHash != null) __obj.updateDynamic("ContentHash")(ContentHash)
    if (Context != null) __obj.updateDynamic("Context")(Context)
    __obj.asInstanceOf[InventoryItem]
  }
}

