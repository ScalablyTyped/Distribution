package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * A list of tags for the resource.
    */
  var TagList: js.UndefOr[typings.awsDashSdk.clientsDmsMod.TagList] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(TagList: TagList = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (TagList != null) __obj.updateDynamic("TagList")(TagList)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

