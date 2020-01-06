package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditMitigationActionsExecutionsResponse extends js.Object {
  /**
    * A set of task execution results based on the input parameters. Details include the mitigation action applied, start time, and task status.
    */
  var actionsExecutions: js.UndefOr[AuditMitigationActionExecutionMetadataList] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAuditMitigationActionsExecutionsResponse {
  @scala.inline
  def apply(actionsExecutions: AuditMitigationActionExecutionMetadataList = null, nextToken: NextToken = null): ListAuditMitigationActionsExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (actionsExecutions != null) __obj.updateDynamic("actionsExecutions")(actionsExecutions.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditMitigationActionsExecutionsResponse]
  }
}

