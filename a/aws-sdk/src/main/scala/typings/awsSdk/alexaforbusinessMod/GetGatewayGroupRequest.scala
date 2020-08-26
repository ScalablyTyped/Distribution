package typings.awsSdk.alexaforbusinessMod

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
  @scala.inline
  implicit class GetGatewayGroupRequestOps[Self <: GetGatewayGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGatewayGroupArn(value: Arn): Self = this.set("GatewayGroupArn", value.asInstanceOf[js.Any])
  }
  
}

