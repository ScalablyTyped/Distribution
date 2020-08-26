package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpcLinkRequest extends js.Object {
  /**
    * [Required] The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
    */
  var vpcLinkId: String = js.native
}

object DeleteVpcLinkRequest {
  @scala.inline
  def apply(vpcLinkId: String): DeleteVpcLinkRequest = {
    val __obj = js.Dynamic.literal(vpcLinkId = vpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcLinkRequest]
  }
  @scala.inline
  implicit class DeleteVpcLinkRequestOps[Self <: DeleteVpcLinkRequest] (val x: Self) extends AnyVal {
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
    def setVpcLinkId(value: String): Self = this.set("vpcLinkId", value.asInstanceOf[js.Any])
  }
  
}

