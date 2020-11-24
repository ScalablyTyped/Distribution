package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVirtualGatewayInput extends js.Object {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the service mesh that the virtual gateway resides in.
    */
  var meshName: ResourceName = js.native
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The new virtual gateway specification to apply. This overwrites the existing data.
    */
  var spec: VirtualGatewaySpec = js.native
  
  /**
    * The name of the virtual gateway to update.
    */
  var virtualGatewayName: ResourceName = js.native
}
object UpdateVirtualGatewayInput {
  
  @scala.inline
  def apply(meshName: ResourceName, spec: VirtualGatewaySpec, virtualGatewayName: ResourceName): UpdateVirtualGatewayInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualGatewayInput]
  }
  
  @scala.inline
  implicit class UpdateVirtualGatewayInputOps[Self <: UpdateVirtualGatewayInput] (val x: Self) extends AnyVal {
    
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
    def setSpec(value: VirtualGatewaySpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayName(value: ResourceName): Self = this.set("virtualGatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setMeshOwner(value: AccountId): Self = this.set("meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshOwner: Self = this.set("meshOwner", js.undefined)
  }
}
