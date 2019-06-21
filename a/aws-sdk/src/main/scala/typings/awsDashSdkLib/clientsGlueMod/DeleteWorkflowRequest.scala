package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWorkflowRequest extends js.Object {
  /**
    * Name of the workflow to be deleted.
    */
  var Name: NameString
}

object DeleteWorkflowRequest {
  @scala.inline
  def apply(Name: NameString): DeleteWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteWorkflowRequest]
  }
}

