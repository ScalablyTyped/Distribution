package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTriggerRequest extends js.Object {
  /**
    * The name of the trigger to delete.
    */
  var Name: NameString
}

object DeleteTriggerRequest {
  @scala.inline
  def apply(Name: NameString): DeleteTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteTriggerRequest]
  }
}

