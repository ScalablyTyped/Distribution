package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The resource ID for which you want to see a list of tags.
    */
  var ResourceId: typings.awsSdk.clientsSsmMod.ResourceId
  
  /**
    * Returns a list of tags for a specific resource type.
    */
  var ResourceType: ResourceTypeForTagging
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceId: ResourceId, ResourceType: ResourceTypeForTagging): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceTypeForTagging): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
