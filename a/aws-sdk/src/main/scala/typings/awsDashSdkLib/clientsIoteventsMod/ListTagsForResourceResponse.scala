package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * The list of tags assigned to the resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(tags: Tags = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

