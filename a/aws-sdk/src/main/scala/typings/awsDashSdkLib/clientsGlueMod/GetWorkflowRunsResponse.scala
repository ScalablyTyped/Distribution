package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkflowRunsResponse extends js.Object {
  /**
    * A continuation token, if not all requested workflow runs have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
    * A list of workflow run metadata objects.
    */
  var Runs: js.UndefOr[WorkflowRuns] = js.undefined
}

object GetWorkflowRunsResponse {
  @scala.inline
  def apply(NextToken: GenericString = null, Runs: WorkflowRuns = null): GetWorkflowRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Runs != null) __obj.updateDynamic("Runs")(Runs)
    __obj.asInstanceOf[GetWorkflowRunsResponse]
  }
}

