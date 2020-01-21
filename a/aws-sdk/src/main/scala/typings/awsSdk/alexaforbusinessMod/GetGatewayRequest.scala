package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGatewayRequest extends js.Object {
  /**
    * The ARN of the gateway to get.
    */
  var GatewayArn: Arn = js.native
}

object GetGatewayRequest {
  @scala.inline
  def apply(GatewayArn: Arn): GetGatewayRequest = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGatewayRequest]
  }
}

