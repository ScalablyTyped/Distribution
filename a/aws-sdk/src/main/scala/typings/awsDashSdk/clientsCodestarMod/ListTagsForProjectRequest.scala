package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForProjectRequest extends js.Object {
  /**
    * The ID of the project to get tags for.
    */
  var id: ProjectId = js.native
  /**
    * Reserved for future use.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * Reserved for future use.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListTagsForProjectRequest {
  @scala.inline
  def apply(id: ProjectId, maxResults: Int | Double = null, nextToken: PaginationToken = null): ListTagsForProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForProjectRequest]
  }
}

