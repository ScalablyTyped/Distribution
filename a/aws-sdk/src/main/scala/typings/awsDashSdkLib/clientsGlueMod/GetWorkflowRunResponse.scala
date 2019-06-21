package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkflowRunResponse extends js.Object {
  /**
    * The requested workflow run metadata.
    */
  var Run: js.UndefOr[WorkflowRun] = js.undefined
}

object GetWorkflowRunResponse {
  @scala.inline
  def apply(Run: WorkflowRun = null): GetWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    if (Run != null) __obj.updateDynamic("Run")(Run)
    __obj.asInstanceOf[GetWorkflowRunResponse]
  }
}

