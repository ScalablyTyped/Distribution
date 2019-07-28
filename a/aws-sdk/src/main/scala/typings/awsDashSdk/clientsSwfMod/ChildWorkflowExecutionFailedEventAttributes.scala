package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildWorkflowExecutionFailedEventAttributes extends js.Object {
  /**
    * The details of the failure (if provided).
    */
  var details: js.UndefOr[Data] = js.undefined
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId
  /**
    * The reason for the failure (if provided).
    */
  var reason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  /**
    * The child workflow execution that failed.
    */
  var workflowExecution: WorkflowExecution
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType
}

object ChildWorkflowExecutionFailedEventAttributes {
  @scala.inline
  def apply(
    initiatedEventId: EventId,
    startedEventId: EventId,
    workflowExecution: WorkflowExecution,
    workflowType: WorkflowType,
    details: Data = null,
    reason: FailureReason = null
  ): ChildWorkflowExecutionFailedEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId, startedEventId = startedEventId, workflowExecution = workflowExecution, workflowType = workflowType)
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[ChildWorkflowExecutionFailedEventAttributes]
  }
}

