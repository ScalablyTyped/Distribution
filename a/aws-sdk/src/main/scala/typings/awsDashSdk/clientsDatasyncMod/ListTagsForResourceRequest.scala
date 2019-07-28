package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The maximum number of locations to return.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.MaxResults] = js.undefined
  /**
    * An opaque string that indicates the position at which to begin the next list of locations.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource whose tags to list.
    */
  var ResourceArn: TaggableResourceArn
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(
    ResourceArn: TaggableResourceArn,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

