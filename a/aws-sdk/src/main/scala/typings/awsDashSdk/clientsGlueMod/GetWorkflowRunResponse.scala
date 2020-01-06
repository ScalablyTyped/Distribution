package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowRunResponse extends js.Object {
  /**
    * The requested workflow run metadata.
    */
  var Run: js.UndefOr[WorkflowRun] = js.native
}

object GetWorkflowRunResponse {
  @scala.inline
  def apply(Run: WorkflowRun = null): GetWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    if (Run != null) __obj.updateDynamic("Run")(Run.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRunResponse]
  }
}

