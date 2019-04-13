package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceInput extends js.Object {
  /**
    * The maximum number of results to be returned per request that lists the tags for the workgroup resource.
    */
  var MaxResults: js.UndefOr[MaxTagsCount] = js.undefined
  /**
    * The token for the next set of results, or null if there are no additional results for this request, where the request lists the tags for the workgroup resource with the specified ARN.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * Lists the tags for the workgroup resource with the specified ARN.
    */
  var ResourceARN: AmazonResourceName
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(
    ResourceARN: AmazonResourceName,
    MaxResults: js.UndefOr[MaxTagsCount] = js.undefined,
    NextToken: Token = null
  ): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

