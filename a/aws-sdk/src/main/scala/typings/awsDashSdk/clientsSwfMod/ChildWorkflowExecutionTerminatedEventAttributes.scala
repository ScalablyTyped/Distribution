package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildWorkflowExecutionTerminatedEventAttributes extends js.Object {
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId
  /**
    * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  /**
    * The child workflow execution that was terminated.
    */
  var workflowExecution: WorkflowExecution
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType
}

object ChildWorkflowExecutionTerminatedEventAttributes {
  @scala.inline
  def apply(
    initiatedEventId: EventId,
    startedEventId: EventId,
    workflowExecution: WorkflowExecution,
    workflowType: WorkflowType
  ): ChildWorkflowExecutionTerminatedEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId, startedEventId = startedEventId, workflowExecution = workflowExecution, workflowType = workflowType)
  
    __obj.asInstanceOf[ChildWorkflowExecutionTerminatedEventAttributes]
  }
}

