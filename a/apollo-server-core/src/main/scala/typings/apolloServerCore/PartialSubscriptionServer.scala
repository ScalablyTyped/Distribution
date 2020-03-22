package typings.apolloServerCore

import typings.subscriptionsTransportWs.serverMod.ConnectionContext
import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<apollo-server-core.apollo-server-core/dist/types.SubscriptionServerOptions> */
trait PartialSubscriptionServer extends js.Object {
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
  var path: js.UndefOr[String] = js.undefined
}

object PartialSubscriptionServer {
  @scala.inline
  def apply(
    keepAlive: Int | Double = null,
    onConnect: (/* connectionParams */ js.Object, /* websocket */ ^, /* context */ ConnectionContext) => _ = null,
    onDisconnect: (/* websocket */ ^, /* context */ ConnectionContext) => _ = null,
    path: String = null
  ): PartialSubscriptionServer = {
    val __obj = js.Dynamic.literal()
    if (keepAlive != null) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction3(onConnect))
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(js.Any.fromFunction2(onDisconnect))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSubscriptionServer]
  }
}

