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
  @scala.inline
  implicit class GetGatewayRequestOps[Self <: GetGatewayRequest] (val x: Self) extends AnyVal {
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
    def setGatewayArn(value: Arn): Self = this.set("GatewayArn", value.asInstanceOf[js.Any])
  }
  
}

