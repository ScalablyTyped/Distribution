package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcLinkRequest extends js.Object {
  /**
    * [Required] The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
    */
  var vpcLinkId: String
}

object GetVpcLinkRequest {
  @scala.inline
  def apply(vpcLinkId: String): GetVpcLinkRequest = {
    val __obj = js.Dynamic.literal(vpcLinkId = vpcLinkId)
  
    __obj.asInstanceOf[GetVpcLinkRequest]
  }
}

