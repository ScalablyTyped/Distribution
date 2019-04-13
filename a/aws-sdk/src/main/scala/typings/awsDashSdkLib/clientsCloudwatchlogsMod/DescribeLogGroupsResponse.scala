package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLogGroupsResponse extends js.Object {
  /**
    * The log groups.
    */
  var logGroups: js.UndefOr[LogGroups] = js.undefined
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeLogGroupsResponse {
  @scala.inline
  def apply(logGroups: LogGroups = null, nextToken: NextToken = null): DescribeLogGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (logGroups != null) __obj.updateDynamic("logGroups")(logGroups)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeLogGroupsResponse]
  }
}

