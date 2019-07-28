package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * The token that specifies the next page of results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * List of tags returned by the ListTagsForResource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, tags: TagList = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

