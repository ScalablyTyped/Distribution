package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcLinkRequest extends js.Object {
  /**
    * [Required] The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
    */
  var vpcLinkId: String = js.native
}

object GetVpcLinkRequest {
  @scala.inline
  def apply(vpcLinkId: String): GetVpcLinkRequest = {
    val __obj = js.Dynamic.literal(vpcLinkId = vpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcLinkRequest]
  }
}

