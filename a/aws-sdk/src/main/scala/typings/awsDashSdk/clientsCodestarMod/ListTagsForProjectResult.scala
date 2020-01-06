package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForProjectResult extends js.Object {
  /**
    * Reserved for future use.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The tags for the project.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object ListTagsForProjectResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, tags: Tags = null): ListTagsForProjectResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForProjectResult]
  }
}

