package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The list of tags assigned to the resource.
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

