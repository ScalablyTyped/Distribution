package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowExecutionSignaledEventAttributes extends js.Object {
  /**
    * The ID of the SignalExternalWorkflowExecutionInitiated event corresponding to the SignalExternalWorkflow decision to signal this workflow execution.The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event. This field is set only if the signal was initiated by another workflow execution.
    */
  var externalInitiatedEventId: js.UndefOr[EventId] = js.undefined
  /**
    * The workflow execution that sent the signal. This is set only of the signal was sent by another workflow execution.
    */
  var externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined
  /**
    * The inputs provided with the signal. The decider can use the signal name and inputs to determine how to process the signal.
    */
  var input: js.UndefOr[Data] = js.undefined
  /**
    * The name of the signal received. The decider can use the signal name and inputs to determine how to the process the signal.
    */
  var signalName: SignalName
}

object WorkflowExecutionSignaledEventAttributes {
  @scala.inline
  def apply(
    signalName: SignalName,
    externalInitiatedEventId: js.UndefOr[EventId] = js.undefined,
    externalWorkflowExecution: WorkflowExecution = null,
    input: Data = null
  ): WorkflowExecutionSignaledEventAttributes = {
    val __obj = js.Dynamic.literal(signalName = signalName)
    if (!js.isUndefined(externalInitiatedEventId)) __obj.updateDynamic("externalInitiatedEventId")(externalInitiatedEventId)
    if (externalWorkflowExecution != null) __obj.updateDynamic("externalWorkflowExecution")(externalWorkflowExecution)
    if (input != null) __obj.updateDynamic("input")(input)
    __obj.asInstanceOf[WorkflowExecutionSignaledEventAttributes]
  }
}

