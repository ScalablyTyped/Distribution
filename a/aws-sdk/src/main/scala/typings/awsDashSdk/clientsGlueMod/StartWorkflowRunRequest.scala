package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartWorkflowRunRequest extends js.Object {
  /**
    * The name of the workflow to start.
    */
  var Name: NameString
}

object StartWorkflowRunRequest {
  @scala.inline
  def apply(Name: NameString): StartWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[StartWorkflowRunRequest]
  }
}

