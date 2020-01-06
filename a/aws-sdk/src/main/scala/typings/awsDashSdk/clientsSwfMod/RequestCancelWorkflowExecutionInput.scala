package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCancelWorkflowExecutionInput extends js.Object {
  /**
    * The name of the domain containing the workflow execution to cancel.
    */
  var domain: DomainName = js.native
  /**
    * The runId of the workflow execution to cancel.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    * The workflowId of the workflow execution to cancel.
    */
  var workflowId: WorkflowId = js.native
}

object RequestCancelWorkflowExecutionInput {
  @scala.inline
  def apply(domain: DomainName, workflowId: WorkflowId, runId: WorkflowRunIdOptional = null): RequestCancelWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    if (runId != null) __obj.updateDynamic("runId")(runId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCancelWorkflowExecutionInput]
  }
}

