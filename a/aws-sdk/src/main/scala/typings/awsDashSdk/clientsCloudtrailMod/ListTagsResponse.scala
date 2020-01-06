package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsResponse extends js.Object {
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of resource tags.
    */
  var ResourceTagList: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.ResourceTagList] = js.native
}

object ListTagsResponse {
  @scala.inline
  def apply(NextToken: String = null, ResourceTagList: ResourceTagList = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceTagList != null) __obj.updateDynamic("ResourceTagList")(ResourceTagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsResponse]
  }
}

