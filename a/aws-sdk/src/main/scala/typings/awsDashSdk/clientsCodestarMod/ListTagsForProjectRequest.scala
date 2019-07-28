package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForProjectRequest extends js.Object {
  /**
    * The ID of the project to get tags for.
    */
  var id: ProjectId
  /**
    * Reserved for future use.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Reserved for future use.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListTagsForProjectRequest {
  @scala.inline
  def apply(
    id: ProjectId,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: PaginationToken = null
  ): ListTagsForProjectRequest = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListTagsForProjectRequest]
  }
}

