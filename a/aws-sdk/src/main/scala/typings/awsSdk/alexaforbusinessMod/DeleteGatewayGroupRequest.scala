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
  @scala.inline
  implicit class DeleteGatewayGroupRequestOps[Self <: DeleteGatewayGroupRequest] (val x: Self) extends AnyVal {
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

