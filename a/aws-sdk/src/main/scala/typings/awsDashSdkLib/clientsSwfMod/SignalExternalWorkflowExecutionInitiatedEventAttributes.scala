package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
  /**
    * Data attached to the event that can be used by the decider in subsequent decision tasks.
    */
  var control: js.UndefOr[Data] = js.undefined
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the SignalExternalWorkflowExecution decision for this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  /**
    * The input provided to the signal.
    */
  var input: js.UndefOr[Data] = js.undefined
  /**
    * The runId of the external workflow execution to send the signal to.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  /**
    * The name of the signal.
    */
  var signalName: SignalName
  /**
    * The workflowId of the external workflow execution.
    */
  var workflowId: WorkflowId
}

object SignalExternalWorkflowExecutionInitiatedEventAttributes {
  @scala.inline
  def apply(
    decisionTaskCompletedEventId: EventId,
    signalName: SignalName,
    workflowId: WorkflowId,
    control: Data = null,
    input: Data = null,
    runId: WorkflowRunIdOptional = null
  ): SignalExternalWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId, signalName = signalName, workflowId = workflowId)
    if (control != null) __obj.updateDynamic("control")(control)
    if (input != null) __obj.updateDynamic("input")(input)
    if (runId != null) __obj.updateDynamic("runId")(runId)
    __obj.asInstanceOf[SignalExternalWorkflowExecutionInitiatedEventAttributes]
  }
}

