package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGatewayGroupRequest extends js.Object {
  /**
    * The ARN of the gateway group to delete.
    */
  var GatewayGroupArn: Arn = js.native
}

object DeleteGatewayGroupRequest {
  @scala.inline
  def apply(GatewayGroupArn: Arn): DeleteGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(GatewayGroupArn = GatewayGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayGroupRequest]
  }
}

