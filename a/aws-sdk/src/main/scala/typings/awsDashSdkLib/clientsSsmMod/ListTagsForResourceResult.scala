package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResult extends js.Object {
  /**
    * A list of tags.
    */
  var TagList: js.UndefOr[TagList] = js.undefined
}

object ListTagsForResourceResult {
  @scala.inline
  def apply(TagList: TagList = null): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal()
    if (TagList != null) __obj.updateDynamic("TagList")(TagList)
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
}

