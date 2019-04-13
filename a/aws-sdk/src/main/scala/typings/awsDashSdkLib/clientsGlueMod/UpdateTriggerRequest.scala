package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTriggerRequest extends js.Object {
  /**
    * The name of the trigger to update.
    */
  var Name: NameString
  /**
    * The new values with which to update the trigger.
    */
  var TriggerUpdate: awsDashSdkLib.clientsGlueMod.TriggerUpdate
}

object UpdateTriggerRequest {
  @scala.inline
  def apply(Name: NameString, TriggerUpdate: TriggerUpdate): UpdateTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name, TriggerUpdate = TriggerUpdate)
  
    __obj.asInstanceOf[UpdateTriggerRequest]
  }
}

