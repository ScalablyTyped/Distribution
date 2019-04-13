package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSlotTypeVersionRequest extends js.Object {
  /**
    * The name of the slot type.
    */
  var name: SlotTypeName
  /**
    * The version of the slot type to delete. You cannot delete the $LATEST version of the slot type. To delete the $LATEST version, use the DeleteSlotType operation.
    */
  var version: NumericalVersion
}

object DeleteSlotTypeVersionRequest {
  @scala.inline
  def apply(name: SlotTypeName, version: NumericalVersion): DeleteSlotTypeVersionRequest = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[DeleteSlotTypeVersionRequest]
  }
}

