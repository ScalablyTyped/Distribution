package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * One or more tags.
    */
  var TagList: typings.awsDashSdk.clientsCloudhsmMod.TagList
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(TagList: TagList): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(TagList = TagList)
  
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

