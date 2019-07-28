package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    *  Tags result for response. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(tags: TagMap = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

