package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditMitigationActionsTasksResponse extends js.Object {
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The collection of audit mitigation tasks that matched the filter criteria.
    */
  var tasks: js.UndefOr[AuditMitigationActionsTaskMetadataList] = js.native
}

object ListAuditMitigationActionsTasksResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, tasks: AuditMitigationActionsTaskMetadataList = null): ListAuditMitigationActionsTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditMitigationActionsTasksResponse]
  }
}

