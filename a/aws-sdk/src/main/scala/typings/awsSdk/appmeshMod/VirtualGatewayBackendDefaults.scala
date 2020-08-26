package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGatewayBackendDefaults extends js.Object {
  /**
    * A reference to an object that represents a client policy.
    */
  var clientPolicy: js.UndefOr[VirtualGatewayClientPolicy] = js.native
}

object VirtualGatewayBackendDefaults {
  @scala.inline
  def apply(): VirtualGatewayBackendDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewayBackendDefaults]
  }
  @scala.inline
  implicit class VirtualGatewayBackendDefaultsOps[Self <: VirtualGatewayBackendDefaults] (val x: Self) extends AnyVal {
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
    def setClientPolicy(value: VirtualGatewayClientPolicy): Self = this.set("clientPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientPolicy: Self = this.set("clientPolicy", js.undefined)
  }
  
}

