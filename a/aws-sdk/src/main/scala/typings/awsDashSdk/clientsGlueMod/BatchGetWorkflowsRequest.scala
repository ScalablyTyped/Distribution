package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetWorkflowsRequest extends js.Object {
  /**
    * Specifies whether to include a graph when returning the workflow resource metadata.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.native
  /**
    * A list of workflow names, which may be the names returned from the ListWorkflows operation.
    */
  var Names: WorkflowNames = js.native
}

object BatchGetWorkflowsRequest {
  @scala.inline
  def apply(Names: WorkflowNames, IncludeGraph: js.UndefOr[scala.Boolean] = js.undefined): BatchGetWorkflowsRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeGraph)) __obj.updateDynamic("IncludeGraph")(IncludeGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetWorkflowsRequest]
  }
}

