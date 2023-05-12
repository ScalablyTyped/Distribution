package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateRecommendationsRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your on-premises storage system.
    */
  var DiscoveryJobArn: typings.awsSdk.clientsDatasyncMod.DiscoveryJobArn
  
  /**
    * Specifies the universally unique identifiers (UUIDs) of the resources in your storage system that you want recommendations on.
    */
  var ResourceIds: typings.awsSdk.clientsDatasyncMod.ResourceIds
  
  /**
    * Specifies the type of resource in your storage system that you want recommendations on.
    */
  var ResourceType: DiscoveryResourceType
}
object GenerateRecommendationsRequest {
  
  inline def apply(DiscoveryJobArn: DiscoveryJobArn, ResourceIds: ResourceIds, ResourceType: DiscoveryResourceType): GenerateRecommendationsRequest = {
    val __obj = js.Dynamic.literal(DiscoveryJobArn = DiscoveryJobArn.asInstanceOf[js.Any], ResourceIds = ResourceIds.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateRecommendationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateRecommendationsRequest] (val x: Self) extends AnyVal {
    
    inline def setDiscoveryJobArn(value: DiscoveryJobArn): Self = StObject.set(x, "DiscoveryJobArn", value.asInstanceOf[js.Any])
    
    inline def setResourceIds(value: ResourceIds): Self = StObject.set(x, "ResourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsVarargs(value: ResourceId*): Self = StObject.set(x, "ResourceIds", js.Array(value*))
    
    inline def setResourceType(value: DiscoveryResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
