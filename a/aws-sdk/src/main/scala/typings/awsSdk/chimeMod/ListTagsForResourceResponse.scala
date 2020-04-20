package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * A list of tag-key value pairs.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: TagList = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

