package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * The list of tags.
    */
  var TagList: js.UndefOr[typings.awsDashSdk.clientsNetworkmanagerMod.TagList] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(TagList: TagList = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (TagList != null) __obj.updateDynamic("TagList")(TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

