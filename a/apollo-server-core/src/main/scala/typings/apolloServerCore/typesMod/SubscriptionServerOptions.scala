package typings.apolloServerCore.typesMod

import typings.subscriptionsTransportWs.serverMod.ConnectionContext
import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionServerOptions extends js.Object {
  var keepAlive: js.UndefOr[Double] = js.native
  var onConnect: js.UndefOr[
    js.Function3[
      /* connectionParams */ js.Object, 
      /* websocket */ ^, 
      /* context */ ConnectionContext, 
      _
    ]
  ] = js.native
  var onDisconnect: js.UndefOr[js.Function2[/* websocket */ ^, /* context */ ConnectionContext, _]] = js.native
  var path: String = js.native
}

object SubscriptionServerOptions {
  @scala.inline
  def apply(path: String): SubscriptionServerOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionServerOptions]
  }
  @scala.inline
  implicit class SubscriptionServerOptionsOps[Self <: SubscriptionServerOptions] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepAlive(value: Double): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setOnConnect(value: (/* connectionParams */ js.Object, /* websocket */ ^, /* context */ ConnectionContext) => _): Self = this.set("onConnect", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    @scala.inline
    def setOnDisconnect(value: (/* websocket */ ^, /* context */ ConnectionContext) => _): Self = this.set("onDisconnect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDisconnect: Self = this.set("onDisconnect", js.undefined)
  }
  
}

