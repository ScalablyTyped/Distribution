package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcLinkRequest extends js.Object {
  /**
    * The description of the VPC link.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * [Required] The name used to label and identify the VPC link.
    */
  var name: String
  /**
    * [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be owned by the same AWS account of the API owner.
    */
  var targetArns: ListOfString
}

object CreateVpcLinkRequest {
  @scala.inline
  def apply(name: String, targetArns: ListOfString, description: String = null): CreateVpcLinkRequest = {
    val __obj = js.Dynamic.literal(name = name, targetArns = targetArns)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[CreateVpcLinkRequest]
  }
}

