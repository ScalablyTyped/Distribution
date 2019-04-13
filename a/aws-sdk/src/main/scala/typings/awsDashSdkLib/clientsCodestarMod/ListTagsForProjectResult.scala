package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForProjectResult extends js.Object {
  /**
    * Reserved for future use.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The tags for the project.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object ListTagsForProjectResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, tags: Tags = null): ListTagsForProjectResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ListTagsForProjectResult]
  }
}

