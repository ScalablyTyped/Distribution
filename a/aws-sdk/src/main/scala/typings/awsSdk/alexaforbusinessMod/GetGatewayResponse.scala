package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGatewayResponse extends js.Object {
  /**
    * The details of the gateway.
    */
  var Gateway: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Gateway] = js.native
}

object GetGatewayResponse {
  @scala.inline
  def apply(): GetGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGatewayResponse]
  }
  @scala.inline
  implicit class GetGatewayResponseOps[Self <: GetGatewayResponse] (val x: Self) extends AnyVal {
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
    def setGateway(value: Gateway): Self = this.set("Gateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGateway: Self = this.set("Gateway", js.undefined)
  }
  
}

