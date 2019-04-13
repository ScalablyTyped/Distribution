package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInventoryEntriesResult extends js.Object {
  /**
    * The time that inventory information was collected for the instance(s).
    */
  var CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined
  /**
    * A list of inventory items on the instance(s).
    */
  var Entries: js.UndefOr[InventoryItemEntryList] = js.undefined
  /**
    * The instance ID targeted by the request to query inventory information.
    */
  var InstanceId: js.UndefOr[InstanceId] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The inventory schema version used by the instance(s).
    */
  var SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
  /**
    * The type of inventory item returned by the request.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
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
    if (CaptureTime != null) __obj.updateDynamic("CaptureTime")(CaptureTime)
    if (Entries != null) __obj.updateDynamic("Entries")(Entries)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion)
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName)
    __obj.asInstanceOf[ListInventoryEntriesResult]
  }
}

