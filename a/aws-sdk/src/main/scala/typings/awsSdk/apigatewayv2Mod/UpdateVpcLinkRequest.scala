package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVpcLinkRequest extends js.Object {
  /**
    * The name of the VPC link.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: string = js.native
}

object UpdateVpcLinkRequest {
  @scala.inline
  def apply(VpcLinkId: string): UpdateVpcLinkRequest = {
    val __obj = js.Dynamic.literal(VpcLinkId = VpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVpcLinkRequest]
  }
  @scala.inline
  implicit class UpdateVpcLinkRequestOps[Self <: UpdateVpcLinkRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

