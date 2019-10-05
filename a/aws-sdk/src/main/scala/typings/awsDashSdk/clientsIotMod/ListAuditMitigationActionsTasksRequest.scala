package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAuditMitigationActionsTasksRequest extends js.Object {
  /**
    * Specify this filter to limit results to tasks that were applied to results for a specific audit.
    */
  var auditTaskId: js.UndefOr[AuditTaskId] = js.undefined
  /**
    * Specify this filter to limit results to tasks that were completed or canceled on or before a specific date and time.
    */
  var endTime: Timestamp
  /**
    * Specify this filter to limit results to tasks that were applied to a specific audit finding.
    */
  var findingId: js.UndefOr[FindingId] = js.undefined
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Specify this filter to limit results to tasks that began on or after a specific date and time.
    */
  var startTime: Timestamp
  /**
    * Specify this filter to limit results to tasks that are in a specific state.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.undefined
}

object ListAuditMitigationActionsTasksRequest {
  @scala.inline
  def apply(
    endTime: Timestamp,
    startTime: Timestamp,
    auditTaskId: AuditTaskId = null,
    findingId: FindingId = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    taskStatus: AuditMitigationActionsTaskStatus = null
  ): ListAuditMitigationActionsTasksRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime, startTime = startTime)
    if (auditTaskId != null) __obj.updateDynamic("auditTaskId")(auditTaskId)
    if (findingId != null) __obj.updateDynamic("findingId")(findingId)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (taskStatus != null) __obj.updateDynamic("taskStatus")(taskStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditMitigationActionsTasksRequest]
  }
}

