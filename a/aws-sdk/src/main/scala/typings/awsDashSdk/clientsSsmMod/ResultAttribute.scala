package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultAttribute extends js.Object {
  /**
    * Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.
    */
  var TypeName: InventoryItemTypeName
}

object ResultAttribute {
  @scala.inline
  def apply(TypeName: InventoryItemTypeName): ResultAttribute = {
    val __obj = js.Dynamic.literal(TypeName = TypeName)
  
    __obj.asInstanceOf[ResultAttribute]
  }
}

