package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSlotTypeRequest extends js.Object {
  /**
    * The name of the slot type. The name is case sensitive. 
    */
  var name: SlotTypeName
}

object DeleteSlotTypeRequest {
  @scala.inline
  def apply(name: SlotTypeName): DeleteSlotTypeRequest = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[DeleteSlotTypeRequest]
  }
}

