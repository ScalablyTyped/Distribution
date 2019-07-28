package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceOutput extends js.Object {
  /**
    * An array of tags associated with the domain.
    */
  var tags: js.UndefOr[ResourceTagList] = js.undefined
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(tags: ResourceTagList = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

