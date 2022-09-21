package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewayRouteInput extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the gateway route to update.
    */
  var gatewayRouteName: ResourceName
  
  /**
    * The name of the service mesh that the gateway route resides in.
    */
  var meshName: ResourceName
  
  /**
    * The Amazon Web Services IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The new gateway route specification to apply. This overwrites the existing data.
    */
  var spec: GatewayRouteSpec
  
  /**
    * The name of the virtual gateway that the gateway route is associated with.
    */
  var virtualGatewayName: ResourceName
}
object UpdateGatewayRouteInput {
  
  inline def apply(
    gatewayRouteName: ResourceName,
    meshName: ResourceName,
    spec: GatewayRouteSpec,
    virtualGatewayName: ResourceName
  ): UpdateGatewayRouteInput = {
    val __obj = js.Dynamic.literal(gatewayRouteName = gatewayRouteName.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayRouteInput]
  }
  
  extension [Self <: UpdateGatewayRouteInput](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setGatewayRouteName(value: ResourceName): Self = StObject.set(x, "gatewayRouteName", value.asInstanceOf[js.Any])
    
    inline def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    inline def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    inline def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
    
    inline def setSpec(value: GatewayRouteSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setVirtualGatewayName(value: ResourceName): Self = StObject.set(x, "virtualGatewayName", value.asInstanceOf[js.Any])
  }
}
