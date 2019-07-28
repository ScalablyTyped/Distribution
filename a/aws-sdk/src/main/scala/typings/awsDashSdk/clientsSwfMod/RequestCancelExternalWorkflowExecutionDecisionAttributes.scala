package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestCancelExternalWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    * The data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.undefined
  /**
    * The runId of the external workflow execution to cancel.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  /**
    *  The workflowId of the external workflow execution to cancel.
    */
  var workflowId: WorkflowId
}

object RequestCancelExternalWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(workflowId: WorkflowId, control: Data = null, runId: WorkflowRunIdOptional = null): RequestCancelExternalWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal(workflowId = workflowId)
    if (control != null) __obj.updateDynamic("control")(control)
    if (runId != null) __obj.updateDynamic("runId")(runId)
    __obj.asInstanceOf[RequestCancelExternalWorkflowExecutionDecisionAttributes]
  }
}

