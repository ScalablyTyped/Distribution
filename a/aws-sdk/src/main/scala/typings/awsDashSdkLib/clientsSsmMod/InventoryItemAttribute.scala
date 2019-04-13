package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemAttribute extends js.Object {
  /**
    * The data type of the inventory item attribute. 
    */
  var DataType: InventoryAttributeDataType
  /**
    * Name of the inventory item attribute.
    */
  var Name: InventoryItemAttributeName
}

object InventoryItemAttribute {
  @scala.inline
  def apply(DataType: InventoryAttributeDataType, Name: InventoryItemAttributeName): InventoryItemAttribute = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], Name = Name)
  
    __obj.asInstanceOf[InventoryItemAttribute]
  }
}

