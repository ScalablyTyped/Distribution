package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkflowsResponse extends js.Object {
  /**
    * A continuation token, if not all workflow names have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
    * List of names of workflows in the account.
    */
  var Workflows: js.UndefOr[WorkflowNames] = js.undefined
}

object ListWorkflowsResponse {
  @scala.inline
  def apply(NextToken: GenericString = null, Workflows: WorkflowNames = null): ListWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Workflows != null) __obj.updateDynamic("Workflows")(Workflows)
    __obj.asInstanceOf[ListWorkflowsResponse]
  }
}

