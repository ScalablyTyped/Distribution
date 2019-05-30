package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromResourceRequest extends js.Object {
  /**
    * The resource ID for which you want to remove tags. Use the ID of the resource. Here are some examples: ManagedInstance: mi-012345abcde MaintenanceWindow: mw-012345abcde PatchBaseline: pb-012345abcde For the Document and Parameter values, use the name of the resource.  The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f. 
    */
  var ResourceId: awsDashSdkLib.clientsSsmMod.ResourceId
  /**
    * The type of resource of which you want to remove a tag.  The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f. 
    */
  var ResourceType: ResourceTypeForTagging
  /**
    * Tag keys that you want to remove from the specified resource.
    */
  var TagKeys: KeyList
}

object RemoveTagsFromResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, ResourceType: ResourceTypeForTagging, TagKeys: KeyList): RemoveTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, ResourceType = ResourceType.asInstanceOf[js.Any], TagKeys = TagKeys)
  
    __obj.asInstanceOf[RemoveTagsFromResourceRequest]
  }
}

