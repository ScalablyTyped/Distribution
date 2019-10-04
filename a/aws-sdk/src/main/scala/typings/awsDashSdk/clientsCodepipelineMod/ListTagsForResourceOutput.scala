package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceOutput extends js.Object {
  /**
    * If the amount of returned information is significantly large, an identifier is also returned and can be used in a subsequent API call to return the next page of the list. The ListTagsforResource call lists all available tags in one call and does not use pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The tags for the resource.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(nextToken: NextToken = null, tags: TagList = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

