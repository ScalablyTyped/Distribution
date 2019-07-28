package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsResponse extends js.Object {
  /**
    *  List of Tag for the requested Elasticsearch domain.
    */
  var TagList: js.UndefOr[typings.awsDashSdk.clientsEsMod.TagList] = js.undefined
}

object ListTagsResponse {
  @scala.inline
  def apply(TagList: TagList = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (TagList != null) __obj.updateDynamic("TagList")(TagList)
    __obj.asInstanceOf[ListTagsResponse]
  }
}

