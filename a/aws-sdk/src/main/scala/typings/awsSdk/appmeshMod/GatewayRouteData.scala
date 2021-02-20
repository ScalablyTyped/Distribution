package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteData extends StObject {
  
  /**
    * The name of the gateway route.
    */
  var gatewayRouteName: ResourceName = js.native
  
  /**
    * The name of the service mesh that the resource resides in. 
    */
  var meshName: ResourceName = js.native
  
  var metadata: ResourceMetadata = js.native
  
  /**
    * The specifications of the gateway route.
    */
  var spec: GatewayRouteSpec = js.native
  
  /**
    * The status of the gateway route.
    */
  var status: GatewayRouteStatus = js.native
  
  /**
    * The virtual gateway that the gateway route is associated with.
    */
  var virtualGatewayName: ResourceName = js.native
}
object GatewayRouteData {
  
  @scala.inline
  def apply(
    gatewayRouteName: ResourceName,
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: GatewayRouteSpec,
    status: GatewayRouteStatus,
    virtualGatewayName: ResourceName
  ): GatewayRouteData = {
    val __obj = js.Dynamic.literal(gatewayRouteName = gatewayRouteName.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteData]
  }
  
  @scala.inline
  implicit class GatewayRouteDataMutableBuilder[Self <: GatewayRouteData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayRouteName(value: ResourceName): Self = StObject.set(x, "gatewayRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: GatewayRouteSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: GatewayRouteStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayName(value: ResourceName): Self = StObject.set(x, "virtualGatewayName", value.asInstanceOf[js.Any])
  }
}
