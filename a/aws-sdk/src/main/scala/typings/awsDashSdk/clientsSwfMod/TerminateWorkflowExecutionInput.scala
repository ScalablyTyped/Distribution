package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateWorkflowExecutionInput extends js.Object {
  /**
    * If set, specifies the policy to use for the child workflow executions of the workflow execution being terminated. This policy overrides the child policy specified for the workflow execution at registration time or when starting the execution. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.    A child policy for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default child policy was specified at registration time then a fault is returned. 
    */
  var childPolicy: js.UndefOr[ChildPolicy] = js.undefined
  /**
    *  Details for terminating the workflow execution.
    */
  var details: js.UndefOr[Data] = js.undefined
  /**
    * The domain of the workflow execution to terminate.
    */
  var domain: DomainName
  /**
    *  A descriptive reason for terminating the workflow execution.
    */
  var reason: js.UndefOr[TerminateReason] = js.undefined
  /**
    * The runId of the workflow execution to terminate.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  /**
    * The workflowId of the workflow execution to terminate.
    */
  var workflowId: WorkflowId
}

object TerminateWorkflowExecutionInput {
  @scala.inline
  def apply(
    domain: DomainName,
    workflowId: WorkflowId,
    childPolicy: ChildPolicy = null,
    details: Data = null,
    reason: TerminateReason = null,
    runId: WorkflowRunIdOptional = null
  ): TerminateWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain, workflowId = workflowId)
    if (childPolicy != null) __obj.updateDynamic("childPolicy")(childPolicy.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (runId != null) __obj.updateDynamic("runId")(runId)
    __obj.asInstanceOf[TerminateWorkflowExecutionInput]
  }
}

