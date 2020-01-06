package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The resource ID for which you want to see a list of tags.
    */
  var ResourceId: typings.awsDashSdk.clientsSsmMod.ResourceId = js.native
  /**
    * Returns a list of tags for a specific resource type.
    */
  var ResourceType: ResourceTypeForTagging = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, ResourceType: ResourceTypeForTagging): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

