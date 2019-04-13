package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTriggerRequest extends js.Object {
  /**
    * The name of the trigger to start.
    */
  var Name: NameString
}

object StartTriggerRequest {
  @scala.inline
  def apply(Name: NameString): StartTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[StartTriggerRequest]
  }
}

