package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayRouteData extends js.Object {
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
  implicit class GatewayRouteDataOps[Self <: GatewayRouteData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGatewayRouteName(value: ResourceName): Self = this.set("gatewayRouteName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeshName(value: ResourceName): Self = this.set("meshName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ResourceMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: GatewayRouteSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: GatewayRouteStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualGatewayName(value: ResourceName): Self = this.set("virtualGatewayName", value.asInstanceOf[js.Any])
  }
  
}

