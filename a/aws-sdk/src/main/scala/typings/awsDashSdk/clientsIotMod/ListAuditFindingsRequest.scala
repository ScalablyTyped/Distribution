package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAuditFindingsRequest extends js.Object {
  /**
    * A filter to limit results to the findings for the specified audit check.
    */
  var checkName: js.UndefOr[AuditCheckName] = js.undefined
  /**
    * A filter to limit results to those found before the specified time. You must specify either the startTime and endTime or the taskId, but not both.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Information identifying the noncompliant resource.
    */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
  /**
    * A filter to limit results to those found after the specified time. You must specify either the startTime and endTime or the taskId, but not both.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter to limit results to the audit with the specified ID. You must specify either the taskId or the startTime and endTime, but not both.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.undefined
}

object ListAuditFindingsRequest {
  @scala.inline
  def apply(
    checkName: AuditCheckName = null,
    endTime: Timestamp = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    resourceIdentifier: ResourceIdentifier = null,
    startTime: Timestamp = null,
    taskId: AuditTaskId = null
  ): ListAuditFindingsRequest = {
    val __obj = js.Dynamic.literal()
    if (checkName != null) __obj.updateDynamic("checkName")(checkName)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    __obj.asInstanceOf[ListAuditFindingsRequest]
  }
}

