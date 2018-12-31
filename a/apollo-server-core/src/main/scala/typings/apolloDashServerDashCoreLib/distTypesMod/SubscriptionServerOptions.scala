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

