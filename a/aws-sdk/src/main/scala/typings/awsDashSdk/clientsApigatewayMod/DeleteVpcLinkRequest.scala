package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVpcLinkRequest extends js.Object {
  /**
    * [Required] The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
    */
  var vpcLinkId: String
}

object DeleteVpcLinkRequest {
  @scala.inline
  def apply(vpcLinkId: String): DeleteVpcLinkRequest = {
    val __obj = js.Dynamic.literal(vpcLinkId = vpcLinkId)
  
    __obj.asInstanceOf[DeleteVpcLinkRequest]
  }
}

