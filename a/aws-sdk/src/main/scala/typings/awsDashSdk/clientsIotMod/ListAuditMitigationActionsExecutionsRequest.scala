package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditMitigationActionsExecutionsRequest extends js.Object {
  /**
    * Specify this filter to limit results to those with a specific status.
    */
  var actionStatus: js.UndefOr[AuditMitigationActionsExecutionStatus] = js.native
  /**
    * Specify this filter to limit results to those that were applied to a specific audit finding.
    */
  var findingId: FindingId = js.native
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Specify this filter to limit results to actions for a specific audit mitigation actions task.
    */
  var taskId: AuditMitigationActionsTaskId = js.native
}

object ListAuditMitigationActionsExecutionsRequest {
  @scala.inline
  def apply(
    findingId: FindingId,
    taskId: AuditMitigationActionsTaskId,
    actionStatus: AuditMitigationActionsExecutionStatus = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): ListAuditMitigationActionsExecutionsRequest = {
    val __obj = js.Dynamic.literal(findingId = findingId.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    if (actionStatus != null) __obj.updateDynamic("actionStatus")(actionStatus.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditMitigationActionsExecutionsRequest]
  }
}

