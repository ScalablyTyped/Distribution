package typings.apolloDashLinkDashWs.libWebSocketLinkMod

import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import typings.apolloDashLinkDashWs.libWebSocketLinkMod.WebSocketLinkNs.Configuration
import typings.subscriptionsDashTransportDashWs.subscriptionsDashTransportDashWsMod.SubscriptionClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-ws/lib/webSocketLink", "WebSocketLink")
@js.native
class WebSocketLink protected () extends ApolloLink {
  def this(paramsOrClient: Configuration) = this()
  def this(paramsOrClient: SubscriptionClient) = this()
  var subscriptionClient: js.Any = js.native
}

