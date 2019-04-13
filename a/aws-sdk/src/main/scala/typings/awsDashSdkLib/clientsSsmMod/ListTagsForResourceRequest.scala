package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The resource ID for which you want to see a list of tags.
    */
  var ResourceId: awsDashSdkLib.clientsSsmMod.ResourceId
  /**
    * Returns a list of tags for a specific resource type.
    */
  var ResourceType: ResourceTypeForTagging
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, ResourceType: ResourceTypeForTagging): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, ResourceType = ResourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

