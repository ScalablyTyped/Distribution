package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInventoryEntriesResult extends js.Object {
  /**
    * The time that inventory information was collected for the instance(s).
    */
  var CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.native
  /**
    * A list of inventory items on the instance(s).
    */
  var Entries: js.UndefOr[InventoryItemEntryList] = js.native
  /**
    * The instance ID targeted by the request to query inventory information.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceId] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
  /**
    * The inventory schema version used by the instance(s).
    */
  var SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.native
  /**
    * The type of inventory item returned by the request.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.native
}

object ListInventoryEntriesResult {
  @scala.inline
  def apply(
    CaptureTime: InventoryItemCaptureTime = null,
    Entries: InventoryItemEntryList = null,
    InstanceId: InstanceId = null,
    NextToken: NextToken = null,
    SchemaVersion: InventoryItemSchemaVersion = null,
    TypeName: InventoryItemTypeName = null
  ): ListInventoryEntriesResult = {
    val __obj = js.Dynamic.literal()
    if (CaptureTime != null) __obj.updateDynamic("CaptureTime")(CaptureTime.asInstanceOf[js.Any])
    if (Entries != null) __obj.updateDynamic("Entries")(Entries.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInventoryEntriesResult]
  }
}

