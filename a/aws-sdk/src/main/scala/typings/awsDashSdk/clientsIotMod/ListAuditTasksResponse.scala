package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAuditTasksResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The audits that were performed during the specified time period.
    */
  var tasks: js.UndefOr[AuditTaskMetadataList] = js.undefined
}

object ListAuditTasksResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, tasks: AuditTaskMetadataList = null): ListAuditTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (tasks != null) __obj.updateDynamic("tasks")(tasks)
    __obj.asInstanceOf[ListAuditTasksResponse]
  }
}

