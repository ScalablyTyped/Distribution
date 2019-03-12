package typings
package apolloDashServerDashCoreLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionServerOptions extends js.Object {
  var keepAlive: js.UndefOr[scala.Double] = js.undefined
  var onConnect: js.UndefOr[
    js.Function3[
      /* connectionParams */ js.Object, 
      /* websocket */ wsLib.wsMod.namespaced, 
      /* context */ subscriptionsDashTransportDashWsLib.distServerMod.ConnectionContext, 
      _
    ]
  ] = js.undefined
  var onDisconnect: js.UndefOr[
    js.Function2[
      /* websocket */ wsLib.wsMod.namespaced, 
      /* context */ subscriptionsDashTransportDashWsLib.distServerMod.ConnectionContext, 
      _
    ]
  ] = js.undefined
  var path: java.lang.String
}

object SubscriptionServerOptions {
  @scala.inline
  def apply(
    path: java.lang.String,
    keepAlive: scala.Int | scala.Double = null,
    onConnect: (/* connectionParams */ js.Object, /* websocket */ wsLib.wsMod.namespaced, /* context */ subscriptionsDashTransportDashWsLib.distServerMod.ConnectionContext) => _ = null,
    onDisconnect: (/* websocket */ wsLib.wsMod.namespaced, /* context */ subscriptionsDashTransportDashWsLib.distServerMod.ConnectionContext) => _ = null
  ): SubscriptionServerOptions = {
    val __obj = js.Dynamic.literal(path = path)
    if (keepAlive != null) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction3(onConnect))
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(js.Any.fromFunction2(onDisconnect))
    __obj.asInstanceOf[SubscriptionServerOptions]
  }
}

