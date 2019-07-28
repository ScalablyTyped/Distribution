package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeQueriesRequest extends js.Object {
  /**
    * Limits the returned queries to only those for the specified log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  /**
    * Limits the number of returned queries to the specified number.
    */
  var maxResults: js.UndefOr[DescribeQueriesMaxResults] = js.undefined
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Limits the returned queries to only those that have the specified status. Valid values are Cancelled, Complete, Failed, Running, and Scheduled.
    */
  var status: js.UndefOr[QueryStatus] = js.undefined
}

object DescribeQueriesRequest {
  @scala.inline
  def apply(
    logGroupName: LogGroupName = null,
    maxResults: js.UndefOr[DescribeQueriesMaxResults] = js.undefined,
    nextToken: NextToken = null,
    status: QueryStatus = null
  ): DescribeQueriesRequest = {
    val __obj = js.Dynamic.literal()
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeQueriesRequest]
  }
}

