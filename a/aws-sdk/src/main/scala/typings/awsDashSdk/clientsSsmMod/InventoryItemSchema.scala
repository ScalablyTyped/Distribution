package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemSchema extends js.Object {
  /**
    * The schema attributes for inventory. This contains data type and attribute name.
    */
  var Attributes: InventoryItemAttributeList
  /**
    * The alias name of the inventory type. The alias name is used for display purposes.
    */
  var DisplayName: js.UndefOr[InventoryTypeDisplayName] = js.undefined
  /**
    * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application, AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
    */
  var TypeName: InventoryItemTypeName
  /**
    * The schema version for the inventory item.
    */
  var Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
}

object InventoryItemSchema {
  @scala.inline
  def apply(
    Attributes: InventoryItemAttributeList,
    TypeName: InventoryItemTypeName,
    DisplayName: InventoryTypeDisplayName = null,
    Version: InventoryItemSchemaVersion = null
  ): InventoryItemSchema = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, TypeName = TypeName)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[InventoryItemSchema]
  }
}

