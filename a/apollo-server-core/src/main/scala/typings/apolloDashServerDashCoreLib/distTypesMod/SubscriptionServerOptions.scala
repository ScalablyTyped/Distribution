package typings
package apolloDashServerDashCoreLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionServerOptions extends js.Object {
  var keepAlive: js.UndefOr[scala.Double] = js.undefined
  var onConnect: js.UndefOr[
    js.Function3[
      /* connectionParams */ coreDashJsLib.Object, 
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
    onConnect: js.Function3[
      /* connectionParams */ coreDashJsLib.Object, 
      /* websocket */ wsLib.wsMod.namespaced, 
      /* context */ subscriptionsDashTransportDashWsLib.distServerMod.ConnectionContext, 
      _
    ] = null,
    onDisconnect: js.Function2[
      /* websocket */ wsLib.wsMod.namespaced, 
      /* context */ subscriptionsDashTransportDashWsLib.distServerMod.ConnectionContext, 
      _
    ] = null
  ): SubscriptionServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (keepAlive != null) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(onConnect)
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(onDisconnect)
    __obj.asInstanceOf[SubscriptionServerOptions]
  }
}

