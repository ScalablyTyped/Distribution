package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsResult extends js.Object {
  /**
    * The tags.
    */
  var TagList: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.TagList] = js.native
}

object DescribeTagsResult {
  @scala.inline
  def apply(TagList: TagList = null): DescribeTagsResult = {
    val __obj = js.Dynamic.literal()
    if (TagList != null) __obj.updateDynamic("TagList")(TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsResult]
  }
}

