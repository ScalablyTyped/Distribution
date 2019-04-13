package typings
package awsDashSdkLib.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsResponse extends js.Object {
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A list of resource tags.
    */
  var ResourceTagList: js.UndefOr[ResourceTagList] = js.undefined
}

object ListTagsResponse {
  @scala.inline
  def apply(NextToken: String = null, ResourceTagList: ResourceTagList = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResourceTagList != null) __obj.updateDynamic("ResourceTagList")(ResourceTagList)
    __obj.asInstanceOf[ListTagsResponse]
  }
}

