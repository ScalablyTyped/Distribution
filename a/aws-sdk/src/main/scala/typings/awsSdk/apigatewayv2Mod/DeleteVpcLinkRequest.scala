package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVpcLinkRequest extends js.Object {
  
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: string = js.native
}
object DeleteVpcLinkRequest {
  
  @scala.inline
  def apply(VpcLinkId: string): DeleteVpcLinkRequest = {
    val __obj = js.Dynamic.literal(VpcLinkId = VpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcLinkRequest]
  }
  
  @scala.inline
  implicit class DeleteVpcLinkRequestOps[Self <: DeleteVpcLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVpcLinkId(value: string): Self = this.set("VpcLinkId", value.asInstanceOf[js.Any])
  }
}
