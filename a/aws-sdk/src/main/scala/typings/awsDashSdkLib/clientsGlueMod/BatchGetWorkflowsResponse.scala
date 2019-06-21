package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetWorkflowsResponse extends js.Object {
  /**
    * A list of names of workflows not found.
    */
  var MissingWorkflows: js.UndefOr[WorkflowNames] = js.undefined
  /**
    * A list of workflow resource metadata.
    */
  var Workflows: js.UndefOr[Workflows] = js.undefined
}

object BatchGetWorkflowsResponse {
  @scala.inline
  def apply(MissingWorkflows: WorkflowNames = null, Workflows: Workflows = null): BatchGetWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    if (MissingWorkflows != null) __obj.updateDynamic("MissingWorkflows")(MissingWorkflows)
    if (Workflows != null) __obj.updateDynamic("Workflows")(Workflows)
    __obj.asInstanceOf[BatchGetWorkflowsResponse]
  }
}

