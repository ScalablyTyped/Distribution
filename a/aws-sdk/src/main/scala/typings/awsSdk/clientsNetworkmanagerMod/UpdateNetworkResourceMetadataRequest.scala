package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNetworkResourceMetadataRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The resource metadata.
    */
  var Metadata: NetworkResourceMetadataMap
  
  /**
    * The ARN of the resource.
    */
  var ResourceArn: typings.awsSdk.clientsNetworkmanagerMod.ResourceArn
}
object UpdateNetworkResourceMetadataRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId, Metadata: NetworkResourceMetadataMap, ResourceArn: ResourceArn): UpdateNetworkResourceMetadataRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNetworkResourceMetadataRequest]
  }
  
  extension [Self <: UpdateNetworkResourceMetadataRequest](x: Self) {
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: NetworkResourceMetadataMap): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
