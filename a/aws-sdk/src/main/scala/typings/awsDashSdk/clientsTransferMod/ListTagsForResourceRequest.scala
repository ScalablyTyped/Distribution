package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * Requests the tags associated with a particular Amazon Resource Name (ARN). An ARN is an identifier for a specific AWS resource, such as a server, user, or role.
    */
  var Arn: typings.awsDashSdk.clientsTransferMod.Arn
  /**
    * Specifies the number of tags to return as a response to the ListTagsForResource request.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsTransferMod.MaxResults] = js.undefined
  /**
    * When you request additional results from the ListTagsForResource call, a NextToken parameter is returned in the input. You can then pass in a subsequent command the NextToken parameter to continue listing additional tags.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsTransferMod.NextToken] = js.undefined
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(Arn: Arn, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

