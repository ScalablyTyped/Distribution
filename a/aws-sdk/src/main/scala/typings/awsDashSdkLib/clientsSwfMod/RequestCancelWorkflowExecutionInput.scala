package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestCancelWorkflowExecutionInput extends js.Object {
  /**
    * The name of the domain containing the workflow execution to cancel.
    */
  var domain: DomainName
  /**
    * The runId of the workflow execution to cancel.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  /**
    * The workflowId of the workflow execution to cancel.
    */
  var workflowId: WorkflowId
}

object RequestCancelWorkflowExecutionInput {
  @scala.inline
  def apply(domain: DomainName, workflowId: WorkflowId, runId: WorkflowRunIdOptional = null): RequestCancelWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain, workflowId = workflowId)
    if (runId != null) __obj.updateDynamic("runId")(runId)
    __obj.asInstanceOf[RequestCancelWorkflowExecutionInput]
  }
}

