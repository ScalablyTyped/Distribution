package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryItemSchema extends js.Object {
  /**
    * The schema attributes for inventory. This contains data type and attribute name.
    */
  var Attributes: InventoryItemAttributeList = js.native
  /**
    * The alias name of the inventory type. The alias name is used for display purposes.
    */
  var DisplayName: js.UndefOr[InventoryTypeDisplayName] = js.native
  /**
    * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application, AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
    */
  var TypeName: InventoryItemTypeName = js.native
  /**
    * The schema version for the inventory item.
    */
  var Version: js.UndefOr[InventoryItemSchemaVersion] = js.native
}

object InventoryItemSchema {
  @scala.inline
  def apply(
    Attributes: InventoryItemAttributeList,
    TypeName: InventoryItemTypeName,
    DisplayName: InventoryTypeDisplayName = null,
    Version: InventoryItemSchemaVersion = null
  ): InventoryItemSchema = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemSchema]
  }
}

