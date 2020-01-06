package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetWorkflowsResponse extends js.Object {
  /**
    * A list of names of workflows not found.
    */
  var MissingWorkflows: js.UndefOr[WorkflowNames] = js.native
  /**
    * A list of workflow resource metadata.
    */
  var Workflows: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Workflows] = js.native
}

object BatchGetWorkflowsResponse {
  @scala.inline
  def apply(MissingWorkflows: WorkflowNames = null, Workflows: Workflows = null): BatchGetWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    if (MissingWorkflows != null) __obj.updateDynamic("MissingWorkflows")(MissingWorkflows.asInstanceOf[js.Any])
    if (Workflows != null) __obj.updateDynamic("Workflows")(Workflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetWorkflowsResponse]
  }
}

