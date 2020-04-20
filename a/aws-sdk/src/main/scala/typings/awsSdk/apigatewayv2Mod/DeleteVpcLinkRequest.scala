package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

