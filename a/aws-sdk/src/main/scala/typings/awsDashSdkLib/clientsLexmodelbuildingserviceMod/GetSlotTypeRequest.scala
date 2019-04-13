package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSlotTypeRequest extends js.Object {
  /**
    * The name of the slot type. The name is case sensitive. 
    */
  var name: SlotTypeName
  /**
    * The version of the slot type. 
    */
  var version: Version
}

object GetSlotTypeRequest {
  @scala.inline
  def apply(name: SlotTypeName, version: Version): GetSlotTypeRequest = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[GetSlotTypeRequest]
  }
}

