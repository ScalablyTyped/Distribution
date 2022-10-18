package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The ID of the resource for which you want to retrieve tags.
    */
  var ResourceId: TagResourceId
  
  /**
    * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: TagResourceType
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceId: TagResourceId, ResourceType: TagResourceType): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceId(value: TagResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: TagResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
