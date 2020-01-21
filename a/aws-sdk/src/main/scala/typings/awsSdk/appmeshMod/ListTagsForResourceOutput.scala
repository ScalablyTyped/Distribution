package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceOutput extends js.Object {
  /**
    * The nextToken value to include in a future ListTagsForResource
    request. When the results of a ListTagsForResource request exceed
    limit, you can use this value to retrieve the next page of results. This
    value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The tags for the resource.
    */
  var tags: TagList = js.native
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(tags: TagList, nextToken: String = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

