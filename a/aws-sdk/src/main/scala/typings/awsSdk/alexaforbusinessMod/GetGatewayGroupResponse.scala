package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGatewayGroupResponse extends js.Object {
  var GatewayGroup: js.UndefOr[typings.awsSdk.alexaforbusinessMod.GatewayGroup] = js.native
}

object GetGatewayGroupResponse {
  @scala.inline
  def apply(): GetGatewayGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGatewayGroupResponse]
  }
  @scala.inline
  implicit class GetGatewayGroupResponseOps[Self <: GetGatewayGroupResponse] (val x: Self) extends AnyVal {
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
    def setGatewayGroup(value: GatewayGroup): Self = this.set("GatewayGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayGroup: Self = this.set("GatewayGroup", js.undefined)
  }
  
}

