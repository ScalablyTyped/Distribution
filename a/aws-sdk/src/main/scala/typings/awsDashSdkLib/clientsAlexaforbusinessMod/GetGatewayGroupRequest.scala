package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGatewayGroupRequest extends js.Object {
  /**
    * The ARN of the gateway group to get.
    */
  var GatewayGroupArn: Arn
}

object GetGatewayGroupRequest {
  @scala.inline
  def apply(GatewayGroupArn: Arn): GetGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(GatewayGroupArn = GatewayGroupArn)
  
    __obj.asInstanceOf[GetGatewayGroupRequest]
  }
}

