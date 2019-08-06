package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAuditTasksRequest extends js.Object {
  /**
    * The end of the time period.
    */
  var endTime: Timestamp
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The beginning of the time period. Audit information is retained for a limited time (180 days). Requesting a start time prior to what is retained results in an "InvalidRequestException".
    */
  var startTime: Timestamp
  /**
    * A filter to limit the output to audits with the specified completion status: can be one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
    */
  var taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined
  /**
    * A filter to limit the output to the specified type of audit: can be one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED__AUDIT_TASK".
    */
  var taskType: js.UndefOr[AuditTaskType] = js.undefined
}

object ListAuditTasksRequest {
  @scala.inline
  def apply(
    endTime: Timestamp,
    startTime: Timestamp,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    taskStatus: AuditTaskStatus = null,
    taskType: AuditTaskType = null
  ): ListAuditTasksRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime, startTime = startTime)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (taskStatus != null) __obj.updateDynamic("taskStatus")(taskStatus.asInstanceOf[js.Any])
    if (taskType != null) __obj.updateDynamic("taskType")(taskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditTasksRequest]
  }
}

