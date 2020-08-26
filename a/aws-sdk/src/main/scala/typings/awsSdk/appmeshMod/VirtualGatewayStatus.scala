package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGatewayStatus extends js.Object {
  /**
    * The current status.
    */
  var status: VirtualGatewayStatusCode = js.native
}

object VirtualGatewayStatus {
  @scala.inline
  def apply(status: VirtualGatewayStatusCode): VirtualGatewayStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayStatus]
  }
  @scala.inline
  implicit class VirtualGatewayStatusOps[Self <: VirtualGatewayStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: VirtualGatewayStatusCode): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

