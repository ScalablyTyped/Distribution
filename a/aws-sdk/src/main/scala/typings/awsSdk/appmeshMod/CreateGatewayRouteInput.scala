package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGatewayRouteInput extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name to use for the gateway route.
    */
  var gatewayRouteName: ResourceName
  
  /**
    * The name of the service mesh to create the gateway route in.
    */
  var meshName: ResourceName
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then the account that you specify must share the mesh with your account before you can create the resource in the service mesh. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The gateway route specification to apply.
    */
  var spec: GatewayRouteSpec
  
  /**
    * Optional metadata that you can apply to the gateway route to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the virtual gateway to associate the gateway route with. If the virtual gateway is in a shared mesh, then you must be the owner of the virtual gateway resource.
    */
  var virtualGatewayName: ResourceName
}
object CreateGatewayRouteInput {
  
  @scala.inline
  def apply(
    gatewayRouteName: ResourceName,
    meshName: ResourceName,
    spec: GatewayRouteSpec,
    virtualGatewayName: ResourceName
  ): CreateGatewayRouteInput = {
    val __obj = js.Dynamic.literal(gatewayRouteName = gatewayRouteName.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayRouteInput]
  }
  
  @scala.inline
  implicit class CreateGatewayRouteInputMutableBuilder[Self <: CreateGatewayRouteInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setGatewayRouteName(value: ResourceName): Self = StObject.set(x, "gatewayRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
    
    @scala.inline
    def setSpec(value: GatewayRouteSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagRef*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVirtualGatewayName(value: ResourceName): Self = StObject.set(x, "virtualGatewayName", value.asInstanceOf[js.Any])
  }
}
