package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTriggerRequest extends js.Object {
  /**
    * The name of the trigger to retrieve.
    */
  var Name: NameString
}

object GetTriggerRequest {
  @scala.inline
  def apply(Name: NameString): GetTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[GetTriggerRequest]
  }
}

