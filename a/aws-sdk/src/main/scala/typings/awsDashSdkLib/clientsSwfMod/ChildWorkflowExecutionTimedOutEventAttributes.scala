package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildWorkflowExecutionTimedOutEventAttributes extends js.Object {
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId
  /**
    * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  /**
    * The type of the timeout that caused the child workflow execution to time out.
    */
  var timeoutType: WorkflowExecutionTimeoutType
  /**
    * The child workflow execution that timed out.
    */
  var workflowExecution: WorkflowExecution
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType
}

object ChildWorkflowExecutionTimedOutEventAttributes {
  @scala.inline
  def apply(
    initiatedEventId: EventId,
    startedEventId: EventId,
    timeoutType: WorkflowExecutionTimeoutType,
    workflowExecution: WorkflowExecution,
    workflowType: WorkflowType
  ): ChildWorkflowExecutionTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId, startedEventId = startedEventId, timeoutType = timeoutType.asInstanceOf[js.Any], workflowExecution = workflowExecution, workflowType = workflowType)
  
    __obj.asInstanceOf[ChildWorkflowExecutionTimedOutEventAttributes]
  }
}

