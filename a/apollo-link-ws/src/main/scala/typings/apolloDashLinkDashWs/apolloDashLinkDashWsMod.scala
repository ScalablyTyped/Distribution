package typings.apolloDashLinkDashWs

import typings.apolloDashLinkDashWs.libWebSocketLinkMod.WebSocketLink.Configuration
import typings.subscriptionsDashTransportDashWs.subscriptionsDashTransportDashWsMod.SubscriptionClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-ws", JSImport.Namespace)
@js.native
object apolloDashLinkDashWsMod extends js.Object {
  @js.native
  class WebSocketLink protected ()
    extends typings.apolloDashLinkDashWs.libWebSocketLinkMod.WebSocketLink {
    def this(paramsOrClient: Configuration) = this()
    def this(paramsOrClient: SubscriptionClient) = this()
  }
  
}

