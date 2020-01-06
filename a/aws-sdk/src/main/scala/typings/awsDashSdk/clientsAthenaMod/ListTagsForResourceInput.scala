package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceInput extends js.Object {
  /**
    * The maximum number of results to be returned per request that lists the tags for the workgroup resource.
    */
  var MaxResults: js.UndefOr[MaxTagsCount] = js.native
  /**
    * The token for the next set of results, or null if there are no additional results for this request, where the request lists the tags for the workgroup resource with the specified ARN.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * Lists the tags for the workgroup resource with the specified ARN.
    */
  var ResourceARN: AmazonResourceName = js.native
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName, MaxResults: Int | Double = null, NextToken: Token = null): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

