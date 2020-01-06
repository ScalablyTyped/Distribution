package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGatewayGroupRequest extends js.Object {
  /**
    * The ARN of the gateway group to get.
    */
  var GatewayGroupArn: Arn = js.native
}

object GetGatewayGroupRequest {
  @scala.inline
  def apply(GatewayGroupArn: Arn): GetGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(GatewayGroupArn = GatewayGroupArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGatewayGroupRequest]
  }
}

