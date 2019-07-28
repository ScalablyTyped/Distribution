package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalWorkflowExecutionCancelRequestedEventAttributes extends js.Object {
  /**
    * The ID of the RequestCancelExternalWorkflowExecutionInitiated event corresponding to the RequestCancelExternalWorkflowExecution decision to cancel this external workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId
  /**
    * The external workflow execution to which the cancellation request was delivered.
    */
  var workflowExecution: WorkflowExecution
}

object ExternalWorkflowExecutionCancelRequestedEventAttributes {
  @scala.inline
  def apply(initiatedEventId: EventId, workflowExecution: WorkflowExecution): ExternalWorkflowExecutionCancelRequestedEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId, workflowExecution = workflowExecution)
  
    __obj.asInstanceOf[ExternalWorkflowExecutionCancelRequestedEventAttributes]
  }
}

