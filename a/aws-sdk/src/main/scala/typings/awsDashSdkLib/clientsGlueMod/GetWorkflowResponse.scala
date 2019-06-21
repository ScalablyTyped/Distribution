package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkflowResponse extends js.Object {
  /**
    * The resource metadata for the workflow.
    */
  var Workflow: js.UndefOr[Workflow] = js.undefined
}

object GetWorkflowResponse {
  @scala.inline
  def apply(Workflow: Workflow = null): GetWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    if (Workflow != null) __obj.updateDynamic("Workflow")(Workflow)
    __obj.asInstanceOf[GetWorkflowResponse]
  }
}

