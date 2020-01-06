package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLogGroupsResponse extends js.Object {
  /**
    * The log groups.
    */
  var logGroups: js.UndefOr[LogGroups] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeLogGroupsResponse {
  @scala.inline
  def apply(logGroups: LogGroups = null, nextToken: NextToken = null): DescribeLogGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (logGroups != null) __obj.updateDynamic("logGroups")(logGroups.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLogGroupsResponse]
  }
}

