package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGatewayRequest extends js.Object {
  /**
    * The ARN of the gateway to get.
    */
  var GatewayArn: Arn
}

object GetGatewayRequest {
  @scala.inline
  def apply(GatewayArn: Arn): GetGatewayRequest = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn)
  
    __obj.asInstanceOf[GetGatewayRequest]
  }
}

