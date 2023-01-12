package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkTelemetry extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The address.
    */
  var Address: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The Amazon Web Services Region.
    */
  var AwsRegion: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The connection health.
    */
  var Health: js.UndefOr[ConnectionHealth] = js.undefined
  
  /**
    * The ARN of the gateway.
    */
  var RegisteredGatewayArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ARN of the resource.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ResourceArn] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[ConstrainedString] = js.undefined
}
object NetworkTelemetry {
  
  inline def apply(): NetworkTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkTelemetry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkTelemetry] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AWSAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAddress(value: ConstrainedString): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setAwsRegion(value: ExternalRegionCode): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setHealth(value: ConnectionHealth): Self = StObject.set(x, "Health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "Health", js.undefined)
    
    inline def setRegisteredGatewayArn(value: ResourceArn): Self = StObject.set(x, "RegisteredGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setRegisteredGatewayArnUndefined: Self = StObject.set(x, "RegisteredGatewayArn", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceId(value: ConstrainedString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: ConstrainedString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
