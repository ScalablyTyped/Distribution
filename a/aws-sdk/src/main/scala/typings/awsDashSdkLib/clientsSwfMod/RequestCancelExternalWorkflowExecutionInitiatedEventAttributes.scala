package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestCancelExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
  /**
    * Data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.undefined
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RequestCancelExternalWorkflowExecution decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  /**
    * The runId of the external workflow execution to be canceled.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  /**
    * The workflowId of the external workflow execution to be canceled.
    */
  var workflowId: WorkflowId
}

object RequestCancelExternalWorkflowExecutionInitiatedEventAttributes {
  @scala.inline
  def apply(
    decisionTaskCompletedEventId: EventId,
    workflowId: WorkflowId,
    control: Data = null,
    runId: WorkflowRunIdOptional = null
  ): RequestCancelExternalWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId, workflowId = workflowId)
    if (control != null) __obj.updateDynamic("control")(control)
    if (runId != null) __obj.updateDynamic("runId")(runId)
    __obj.asInstanceOf[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes]
  }
}

