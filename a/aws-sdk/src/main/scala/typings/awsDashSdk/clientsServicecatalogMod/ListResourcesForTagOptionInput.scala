package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesForTagOptionInput extends js.Object {
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageSize] = js.undefined
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageToken] = js.undefined
  /**
    * The resource type.    Portfolio     Product   
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ResourceType] = js.undefined
  /**
    * The TagOption identifier.
    */
  var TagOptionId: typings.awsDashSdk.clientsServicecatalogMod.TagOptionId
}

object ListResourcesForTagOptionInput {
  @scala.inline
  def apply(
    TagOptionId: TagOptionId,
    PageSize: Int | Double = null,
    PageToken: PageToken = null,
    ResourceType: ResourceType = null
  ): ListResourcesForTagOptionInput = {
    val __obj = js.Dynamic.literal(TagOptionId = TagOptionId)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[ListResourcesForTagOptionInput]
  }
}

