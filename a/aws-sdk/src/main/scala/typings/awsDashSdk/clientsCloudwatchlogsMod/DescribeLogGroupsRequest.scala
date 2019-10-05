package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLogGroupsRequest extends js.Object {
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.undefined
  /**
    * The prefix to match.
    */
  var logGroupNamePrefix: js.UndefOr[LogGroupName] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeLogGroupsRequest {
  @scala.inline
  def apply(limit: Int | Double = null, logGroupNamePrefix: LogGroupName = null, nextToken: NextToken = null): DescribeLogGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (logGroupNamePrefix != null) __obj.updateDynamic("logGroupNamePrefix")(logGroupNamePrefix)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeLogGroupsRequest]
  }
}

