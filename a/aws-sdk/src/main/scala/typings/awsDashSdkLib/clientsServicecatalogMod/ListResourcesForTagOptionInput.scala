package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesForTagOptionInput extends js.Object {
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * The resource type.    Portfolio     Product   
    */
  var ResourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The TagOption identifier.
    */
  var TagOptionId: awsDashSdkLib.clientsServicecatalogMod.TagOptionId
}

object ListResourcesForTagOptionInput {
  @scala.inline
  def apply(
    TagOptionId: TagOptionId,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    PageToken: PageToken = null,
    ResourceType: ResourceType = null
  ): ListResourcesForTagOptionInput = {
    val __obj = js.Dynamic.literal(TagOptionId = TagOptionId)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[ListResourcesForTagOptionInput]
  }
}

