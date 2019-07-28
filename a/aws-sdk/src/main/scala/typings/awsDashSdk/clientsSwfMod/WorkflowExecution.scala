package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowExecution extends js.Object {
  /**
    * A system-generated unique identifier for the workflow execution.
    */
  var runId: WorkflowRunId
  /**
    * The user defined identifier associated with the workflow execution.
    */
  var workflowId: WorkflowId
}

object WorkflowExecution {
  @scala.inline
  def apply(runId: WorkflowRunId, workflowId: WorkflowId): WorkflowExecution = {
    val __obj = js.Dynamic.literal(runId = runId, workflowId = workflowId)
  
    __obj.asInstanceOf[WorkflowExecution]
  }
}

