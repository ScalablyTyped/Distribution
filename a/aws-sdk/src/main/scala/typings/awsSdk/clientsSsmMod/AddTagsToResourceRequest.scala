package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsToResourceRequest extends StObject {
  
  /**
    * The resource ID you want to tag. Use the ID of the resource. Here are some examples:  MaintenanceWindow: mw-012345abcde   PatchBaseline: pb-012345abcde   Automation: example-c160-4567-8519-012345abcde   OpsMetadata object: ResourceID for tagging is created from the Amazon Resource Name (ARN) for the object. Specifically, ResourceID is created from the strings that come after the word opsmetadata in the ARN. For example, an OpsMetadata object with an ARN of arn:aws:ssm:us-east-2:1234567890:opsmetadata/aws/ssm/MyGroup/appmanager has a ResourceID of either aws/ssm/MyGroup/appmanager or /aws/ssm/MyGroup/appmanager. For the Document and Parameter values, use the name of the resource.  ManagedInstance: mi-012345abcde   The ManagedInstance type for this API operation is only for on-premises managed nodes. You must specify the name of the managed node in the following format: mi-ID_number . For example, mi-1a2b3c4d5e6f. 
    */
  var ResourceId: typings.awsSdk.clientsSsmMod.ResourceId
  
  /**
    * Specifies the type of resource you are tagging.  The ManagedInstance type for this API operation is for on-premises managed nodes. You must specify the name of the managed node in the following format: mi-ID_number . For example, mi-1a2b3c4d5e6f. 
    */
  var ResourceType: ResourceTypeForTagging
  
  /**
    * One or more tags. The value parameter is required.  Don't enter personally identifiable information in this field. 
    */
  var Tags: TagList
}
object AddTagsToResourceRequest {
  
  inline def apply(ResourceId: ResourceId, ResourceType: ResourceTypeForTagging, Tags: TagList): AddTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddTagsToResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceTypeForTagging): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
