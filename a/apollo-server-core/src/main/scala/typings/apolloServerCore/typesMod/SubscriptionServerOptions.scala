package typings.apolloServerCore.typesMod

import typings.subscriptionsTransportWs.serverMod.ConnectionContext
import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionServerOptions extends js.Object {
  var keepAlive: js.UndefOr[Double] = js.undefined
  var onConnect: js.UndefOr[
    js.Function3[
      /* connectionParams */ js.Object, 
      /* websocket */ ^, 
      /* context */ ConnectionContext, 
      _
    ]
  ] = js.undefined
  var onDisconnect: js.UndefOr[js.Function2[/* websocket */ ^, /* context */ ConnectionContext, _]] = js.undefined
  var path: String
}

object SubscriptionServerOptions {
  @scala.inline
  def apply(
    path: String,
    keepAlive: Int | Double = null,
    onConnect: (/* connectionParams */ js.Object, /* websocket */ ^, /* context */ ConnectionContext) => _ = null,
    onDisconnect: (/* websocket */ ^, /* context */ ConnectionContext) => _ = null
  ): SubscriptionServerOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (keepAlive != null) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction3(onConnect))
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(js.Any.fromFunction2(onDisconnect))
    __obj.asInstanceOf[SubscriptionServerOptions]
  }
}

