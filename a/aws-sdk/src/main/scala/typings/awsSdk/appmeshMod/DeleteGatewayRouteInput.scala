package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGatewayRouteInput extends StObject {
  
  /**
    * The name of the gateway route to delete.
    */
  var gatewayRouteName: ResourceName
  
  /**
    * The name of the service mesh to delete the gateway route from.
    */
  var meshName: ResourceName
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The name of the virtual gateway to delete the route from.
    */
  var virtualGatewayName: ResourceName
}
object DeleteGatewayRouteInput {
  
  @scala.inline
  def apply(gatewayRouteName: ResourceName, meshName: ResourceName, virtualGatewayName: ResourceName): DeleteGatewayRouteInput = {
    val __obj = js.Dynamic.literal(gatewayRouteName = gatewayRouteName.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayRouteInput]
  }
  
  @scala.inline
  implicit class DeleteGatewayRouteInputMutableBuilder[Self <: DeleteGatewayRouteInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayRouteName(value: ResourceName): Self = StObject.set(x, "gatewayRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
    
    @scala.inline
    def setVirtualGatewayName(value: ResourceName): Self = StObject.set(x, "virtualGatewayName", value.asInstanceOf[js.Any])
  }
}
