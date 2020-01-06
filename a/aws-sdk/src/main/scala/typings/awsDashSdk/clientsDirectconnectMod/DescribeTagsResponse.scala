package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsResponse extends js.Object {
  /**
    * Information about the tags.
    */
  var resourceTags: js.UndefOr[ResourceTagList] = js.native
}

object DescribeTagsResponse {
  @scala.inline
  def apply(resourceTags: ResourceTagList = null): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (resourceTags != null) __obj.updateDynamic("resourceTags")(resourceTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsResponse]
  }
}

