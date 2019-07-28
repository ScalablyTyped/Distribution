package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDestinationsRequest extends js.Object {
  /**
    * The prefix to match. If you don't specify a value, no prefix filter is applied.
    */
  var DestinationNamePrefix: js.UndefOr[DestinationName] = js.undefined
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeDestinationsRequest {
  @scala.inline
  def apply(
    DestinationNamePrefix: DestinationName = null,
    limit: js.UndefOr[DescribeLimit] = js.undefined,
    nextToken: NextToken = null
  ): DescribeDestinationsRequest = {
    val __obj = js.Dynamic.literal()
    if (DestinationNamePrefix != null) __obj.updateDynamic("DestinationNamePrefix")(DestinationNamePrefix)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeDestinationsRequest]
  }
}

