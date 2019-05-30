package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The maximum number of tags to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token that specifies the next page of results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource whose tags are to be returned.
    */
  var resourceArn: ResourceArn
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(
    resourceArn: ResourceArn,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

