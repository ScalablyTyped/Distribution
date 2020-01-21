package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcLinkRequest extends js.Object {
  /**
    * The description of the VPC link.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Required] The name used to label and identify the VPC link.
    */
  var name: String = js.native
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  /**
    * [Required] The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be owned by the same AWS account of the API owner.
    */
  var targetArns: ListOfString = js.native
}

object CreateVpcLinkRequest {
  @scala.inline
  def apply(
    name: String,
    targetArns: ListOfString,
    description: String = null,
    tags: MapOfStringToString = null
  ): CreateVpcLinkRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], targetArns = targetArns.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcLinkRequest]
  }
}

