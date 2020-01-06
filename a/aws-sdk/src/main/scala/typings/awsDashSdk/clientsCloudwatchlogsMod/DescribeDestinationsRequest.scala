package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDestinationsRequest extends js.Object {
  /**
    * The prefix to match. If you don't specify a value, no prefix filter is applied.
    */
  var DestinationNamePrefix: js.UndefOr[DestinationName] = js.native
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeDestinationsRequest {
  @scala.inline
  def apply(
    DestinationNamePrefix: DestinationName = null,
    limit: Int | Double = null,
    nextToken: NextToken = null
  ): DescribeDestinationsRequest = {
    val __obj = js.Dynamic.literal()
    if (DestinationNamePrefix != null) __obj.updateDynamic("DestinationNamePrefix")(DestinationNamePrefix.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDestinationsRequest]
  }
}

