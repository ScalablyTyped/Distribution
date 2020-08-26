package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGatewayData extends js.Object {
  /**
    * The name of the service mesh that the virtual gateway resides in.
    */
  var meshName: ResourceName = js.native
  var metadata: ResourceMetadata = js.native
  /**
    * The specifications of the virtual gateway.
    */
  var spec: VirtualGatewaySpec = js.native
  /**
    * The current status of the virtual gateway.
    */
  var status: VirtualGatewayStatus = js.native
  /**
    * The name of the virtual gateway.
    */
  var virtualGatewayName: ResourceName = js.native
}

object VirtualGatewayData {
  @scala.inline
  def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualGatewaySpec,
    status: VirtualGatewayStatus,
    virtualGatewayName: ResourceName
  ): VirtualGatewayData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayData]
  }
  @scala.inline
  implicit class VirtualGatewayDataOps[Self <: VirtualGatewayData] (val x: Self) extends AnyVal {
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
    def setMeshName(value: ResourceName): Self = this.set("meshName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ResourceMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: VirtualGatewaySpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: VirtualGatewayStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualGatewayName(value: ResourceName): Self = this.set("virtualGatewayName", value.asInstanceOf[js.Any])
  }
  
}

