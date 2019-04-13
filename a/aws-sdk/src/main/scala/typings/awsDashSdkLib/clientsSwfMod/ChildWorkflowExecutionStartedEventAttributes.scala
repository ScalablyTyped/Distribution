package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildWorkflowExecutionStartedEventAttributes extends js.Object {
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId
  /**
    * The child workflow execution that was started.
    */
  var workflowExecution: WorkflowExecution
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType
}

object ChildWorkflowExecutionStartedEventAttributes {
  @scala.inline
  def apply(initiatedEventId: EventId, workflowExecution: WorkflowExecution, workflowType: WorkflowType): ChildWorkflowExecutionStartedEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId, workflowExecution = workflowExecution, workflowType = workflowType)
  
    __obj.asInstanceOf[ChildWorkflowExecutionStartedEventAttributes]
  }
}

