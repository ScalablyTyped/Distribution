package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    *  A list of tags for the specified The Amazon Resource Name (ARN). 
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(tags: TagMap = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

