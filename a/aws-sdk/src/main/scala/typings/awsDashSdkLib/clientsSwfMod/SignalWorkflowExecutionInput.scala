package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalWorkflowExecutionInput extends js.Object {
  /**
    * The name of the domain containing the workflow execution to signal.
    */
  var domain: DomainName
  /**
    * Data to attach to the WorkflowExecutionSignaled event in the target workflow execution's history.
    */
  var input: js.UndefOr[Data] = js.undefined
  /**
    * The runId of the workflow execution to signal.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  /**
    * The name of the signal. This name must be meaningful to the target workflow.
    */
  var signalName: SignalName
  /**
    * The workflowId of the workflow execution to signal.
    */
  var workflowId: WorkflowId
}

object SignalWorkflowExecutionInput {
  @scala.inline
  def apply(
    domain: DomainName,
    signalName: SignalName,
    workflowId: WorkflowId,
    input: Data = null,
    runId: WorkflowRunIdOptional = null
  ): SignalWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain, signalName = signalName, workflowId = workflowId)
    if (input != null) __obj.updateDynamic("input")(input)
    if (runId != null) __obj.updateDynamic("runId")(runId)
    __obj.asInstanceOf[SignalWorkflowExecutionInput]
  }
}

