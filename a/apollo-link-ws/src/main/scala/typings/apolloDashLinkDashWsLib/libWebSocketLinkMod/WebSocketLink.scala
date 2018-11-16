package typings
package apolloDashLinkDashWsLib.libWebSocketLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-ws/lib/webSocketLink", "WebSocketLink")
@js.native
class WebSocketLink protected ()
  extends apolloDashLinkLib.apolloDashLinkMod.ApolloLink {
  def this(paramsOrClient: apolloDashLinkDashWsLib.libWebSocketLinkMod.WebSocketLinkNs.Configuration) = this()
  def this(paramsOrClient: subscriptionsDashTransportDashWsLib.subscriptionsDashTransportDashWsMod.SubscriptionClient) = this()
  var subscriptionClient: js.Any = js.native
}

