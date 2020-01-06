package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTriggerRequest extends js.Object {
  /**
    * The name of the trigger to retrieve.
    */
  var Name: NameString = js.native
}

object GetTriggerRequest {
  @scala.inline
  def apply(Name: NameString): GetTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTriggerRequest]
  }
}

