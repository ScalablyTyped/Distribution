package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopTriggerRequest extends js.Object {
  /**
    * The name of the trigger to stop.
    */
  var Name: NameString
}

object StopTriggerRequest {
  @scala.inline
  def apply(Name: NameString): StopTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[StopTriggerRequest]
  }
}

