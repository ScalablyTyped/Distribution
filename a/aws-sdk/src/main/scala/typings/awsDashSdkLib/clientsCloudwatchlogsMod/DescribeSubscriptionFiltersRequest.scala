package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSubscriptionFiltersRequest extends js.Object {
  /**
    * The prefix to match. If you don't specify a value, no prefix filter is applied.
    */
  var filterNamePrefix: js.UndefOr[FilterName] = js.undefined
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.undefined
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeSubscriptionFiltersRequest {
  @scala.inline
  def apply(
    logGroupName: LogGroupName,
    filterNamePrefix: FilterName = null,
    limit: js.UndefOr[DescribeLimit] = js.undefined,
    nextToken: NextToken = null
  ): DescribeSubscriptionFiltersRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName)
    if (filterNamePrefix != null) __obj.updateDynamic("filterNamePrefix")(filterNamePrefix)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeSubscriptionFiltersRequest]
  }
}

