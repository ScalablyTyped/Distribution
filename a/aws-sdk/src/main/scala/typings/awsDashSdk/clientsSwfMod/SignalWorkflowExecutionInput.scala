package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalWorkflowExecutionInput extends js.Object {
  /**
    * The name of the domain containing the workflow execution to signal.
    */
  var domain: DomainName = js.native
  /**
    * Data to attach to the WorkflowExecutionSignaled event in the target workflow execution's history.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The runId of the workflow execution to signal.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    * The name of the signal. This name must be meaningful to the target workflow.
    */
  var signalName: SignalName = js.native
  /**
    * The workflowId of the workflow execution to signal.
    */
  var workflowId: WorkflowId = js.native
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
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], signalName = signalName.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (runId != null) __obj.updateDynamic("runId")(runId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalWorkflowExecutionInput]
  }
}

