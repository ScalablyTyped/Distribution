package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGatewayRouteInput extends js.Object {
  /**
    * The name of the gateway route to delete.
    */
  var gatewayRouteName: ResourceName = js.native
  /**
    * The name of the service mesh to delete the gateway route from.
    */
  var meshName: ResourceName = js.native
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's
    the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  /**
    * The name of the virtual gateway to delete the route from.
    */
  var virtualGatewayName: ResourceName = js.native
}

object DeleteGatewayRouteInput {
  @scala.inline
  def apply(gatewayRouteName: ResourceName, meshName: ResourceName, virtualGatewayName: ResourceName): DeleteGatewayRouteInput = {
    val __obj = js.Dynamic.literal(gatewayRouteName = gatewayRouteName.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayRouteInput]
  }
  @scala.inline
  implicit class DeleteGatewayRouteInputOps[Self <: DeleteGatewayRouteInput] (val x: Self) extends AnyVal {
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
    def setVirtualGatewayName(value: ResourceName): Self = this.set("virtualGatewayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeshOwner(value: AccountId): Self = this.set("meshOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeshOwner: Self = this.set("meshOwner", js.undefined)
  }
  
}

