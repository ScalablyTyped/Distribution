package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetWorkflowsRequest extends js.Object {
  /**
    * Specifies whether to include a graph when returning the workflow resource metadata.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * A list of workflow names, which may be the names returned from the ListWorkflows operation.
    */
  var Names: WorkflowNames
}

object BatchGetWorkflowsRequest {
  @scala.inline
  def apply(Names: WorkflowNames, IncludeGraph: js.UndefOr[scala.Boolean] = js.undefined): BatchGetWorkflowsRequest = {
    val __obj = js.Dynamic.literal(Names = Names)
    if (!js.isUndefined(IncludeGraph)) __obj.updateDynamic("IncludeGraph")(IncludeGraph)
    __obj.asInstanceOf[BatchGetWorkflowsRequest]
  }
}

