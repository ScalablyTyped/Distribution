package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsFromResourceRequest extends StObject {
  
  /**
    * The ID of the resource from which you want to remove tags. For example: ManagedInstance: mi-012345abcde MaintenanceWindow: mw-012345abcde  Automation: example-c160-4567-8519-012345abcde  PatchBaseline: pb-012345abcde OpsMetadata object: ResourceID for tagging is created from the Amazon Resource Name (ARN) for the object. Specifically, ResourceID is created from the strings that come after the word opsmetadata in the ARN. For example, an OpsMetadata object with an ARN of arn:aws:ssm:us-east-2:1234567890:opsmetadata/aws/ssm/MyGroup/appmanager has a ResourceID of either aws/ssm/MyGroup/appmanager or /aws/ssm/MyGroup/appmanager. For the Document and Parameter values, use the name of the resource.  The ManagedInstance type for this API operation is only for on-premises managed nodes. Specify the name of the managed node in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f. 
    */
  var ResourceId: typings.awsSdk.clientsSsmMod.ResourceId
  
  /**
    * The type of resource from which you want to remove a tag.  The ManagedInstance type for this API operation is only for on-premises managed nodes. Specify the name of the managed node in the following format: mi-ID_number . For example, mi-1a2b3c4d5e6f. 
    */
  var ResourceType: ResourceTypeForTagging
  
  /**
    * Tag keys that you want to remove from the specified resource.
    */
  var TagKeys: KeyList
}
object RemoveTagsFromResourceRequest {
  
  inline def apply(ResourceId: ResourceId, ResourceType: ResourceTypeForTagging, TagKeys: KeyList): RemoveTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveTagsFromResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceTypeForTagging): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: KeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
