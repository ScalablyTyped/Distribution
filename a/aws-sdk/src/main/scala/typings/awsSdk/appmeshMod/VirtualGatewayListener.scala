package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGatewayListener extends js.Object {
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[VirtualGatewayHealthCheckPolicy] = js.native
  /**
    * The port mapping information for the listener.
    */
  var portMapping: VirtualGatewayPortMapping = js.native
  /**
    * A reference to an object that represents the Transport Layer Security (TLS) properties for the listener.
    */
  var tls: js.UndefOr[VirtualGatewayListenerTls] = js.native
}

object VirtualGatewayListener {
  @scala.inline
  def apply(portMapping: VirtualGatewayPortMapping): VirtualGatewayListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayListener]
  }
  @scala.inline
  implicit class VirtualGatewayListenerOps[Self <: VirtualGatewayListener] (val x: Self) extends AnyVal {
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
    def setPortMapping(value: VirtualGatewayPortMapping): Self = this.set("portMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealthCheck(value: VirtualGatewayHealthCheckPolicy): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
    @scala.inline
    def setTls(value: VirtualGatewayListenerTls): Self = this.set("tls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
  }
  
}

