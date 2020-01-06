package typings.awsDashSdk.clientsApigatewayMod

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
}

