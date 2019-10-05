package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The maximum number of tags that you want to return in the response to a ListTagsForResource request. If you don't specify a value for MaxResults, Resolver returns up to 100 tags.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.MaxResults] = js.undefined
  /**
    * For the first ListTagsForResource request, omit this value. If you have more than MaxResults tags, you can submit another ListTagsForResource request to get the next group of tags for the resource. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the resource that you want to list tags for.
    */
  var ResourceArn: Arn
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceArn: Arn, MaxResults: Int | Double = null, NextToken: NextToken = null): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

