package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateTagSpecificationRequest extends StObject {
  
  /**
    * The type of resource to tag. The Valid Values are all the resource types that can be tagged. However, when creating a launch template, you can specify tags for the following resource types only: instance | volume | elastic-gpu | network-interface | spot-instances-request  To tag a resource after it has been created, see CreateTags.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.ResourceType] = js.undefined
  
  /**
    * The tags to apply to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object LaunchTemplateTagSpecificationRequest {
  
  inline def apply(): LaunchTemplateTagSpecificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateTagSpecificationRequest]
  }
  
  extension [Self <: LaunchTemplateTagSpecificationRequest](x: Self) {
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
