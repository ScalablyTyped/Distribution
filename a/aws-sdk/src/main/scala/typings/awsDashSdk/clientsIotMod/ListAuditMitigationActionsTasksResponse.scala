package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAuditMitigationActionsTasksResponse extends js.Object {
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The collection of audit mitigation tasks that matched the filter criteria.
    */
  var tasks: js.UndefOr[AuditMitigationActionsTaskMetadataList] = js.undefined
}

object ListAuditMitigationActionsTasksResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, tasks: AuditMitigationActionsTaskMetadataList = null): ListAuditMitigationActionsTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (tasks != null) __obj.updateDynamic("tasks")(tasks)
    __obj.asInstanceOf[ListAuditMitigationActionsTasksResponse]
  }
}

