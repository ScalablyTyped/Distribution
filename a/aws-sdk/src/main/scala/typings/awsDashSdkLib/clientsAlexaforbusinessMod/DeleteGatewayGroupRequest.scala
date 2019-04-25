package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGatewayGroupRequest extends js.Object {
  /**
    * The ARN of the gateway group to delete.
    */
  var GatewayGroupArn: Arn
}

object DeleteGatewayGroupRequest {
  @scala.inline
  def apply(GatewayGroupArn: Arn): DeleteGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(GatewayGroupArn = GatewayGroupArn)
  
    __obj.asInstanceOf[DeleteGatewayGroupRequest]
  }
}

