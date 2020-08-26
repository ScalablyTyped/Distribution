package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGatewaySpec extends js.Object {
  /**
    * A reference to an object that represents the defaults for backends.
    */
  var backendDefaults: js.UndefOr[VirtualGatewayBackendDefaults] = js.native
  /**
    * The listeners that the mesh endpoint is expected to receive inbound traffic from. You
    can specify one listener.
    */
  var listeners: VirtualGatewayListeners = js.native
  var logging: js.UndefOr[VirtualGatewayLogging] = js.native
}

object VirtualGatewaySpec {
  @scala.inline
  def apply(listeners: VirtualGatewayListeners): VirtualGatewaySpec = {
    val __obj = js.Dynamic.literal(listeners = listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpec]
  }
  @scala.inline
  implicit class VirtualGatewaySpecOps[Self <: VirtualGatewaySpec] (val x: Self) extends AnyVal {
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
    def setListenersVarargs(value: VirtualGatewayListener*): Self = this.set("listeners", js.Array(value :_*))
    @scala.inline
    def setListeners(value: VirtualGatewayListeners): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackendDefaults(value: VirtualGatewayBackendDefaults): Self = this.set("backendDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackendDefaults: Self = this.set("backendDefaults", js.undefined)
    @scala.inline
    def setLogging(value: VirtualGatewayLogging): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
  }
  
}

