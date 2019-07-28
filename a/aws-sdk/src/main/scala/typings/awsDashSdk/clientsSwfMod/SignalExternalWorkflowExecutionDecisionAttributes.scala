package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalExternalWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    * The data attached to the event that can be used by the decider in subsequent decision tasks.
    */
  var control: js.UndefOr[Data] = js.undefined
  /**
    *  The input data to be provided with the signal. The target workflow execution uses the signal name and input data to process the signal.
    */
  var input: js.UndefOr[Data] = js.undefined
  /**
    * The runId of the workflow execution to be signaled.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  /**
    *  The name of the signal.The target workflow execution uses the signal name and input to process the signal.
    */
  var signalName: SignalName
  /**
    *  The workflowId of the workflow execution to be signaled.
    */
  var workflowId: WorkflowId
}

object SignalExternalWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(
    signalName: SignalName,
    workflowId: WorkflowId,
    control: Data = null,
    input: Data = null,
    runId: WorkflowRunIdOptional = null
  ): SignalExternalWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal(signalName = signalName, workflowId = workflowId)
    if (control != null) __obj.updateDynamic("control")(control)
    if (input != null) __obj.updateDynamic("input")(input)
    if (runId != null) __obj.updateDynamic("runId")(runId)
    __obj.asInstanceOf[SignalExternalWorkflowExecutionDecisionAttributes]
  }
}

