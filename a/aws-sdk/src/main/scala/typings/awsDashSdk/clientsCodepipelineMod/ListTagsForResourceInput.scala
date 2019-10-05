package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceInput extends js.Object {
  /**
    * The maximum number of results to return in a single call.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token that was returned from the previous API call, which would be used to return the next page of the list. The ListTagsforResource call lists all available tags in one call and does not use pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource to get tags for.
    */
  var resourceArn: ResourceArn
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(resourceArn: ResourceArn, maxResults: Int | Double = null, nextToken: NextToken = null): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

