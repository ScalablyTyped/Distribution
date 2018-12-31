package typings
package apolloDashLinkDashWsLib.libWebSocketLinkMod.WebSocketLinkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration to use when constructing the subscription client (subscriptions-transport-ws).
  */
trait Configuration extends js.Object {
  /**
    * Options to pass when constructing the subscription client.
    */
  var options: js.UndefOr[subscriptionsDashTransportDashWsLib.distClientMod.ClientOptions] = js.undefined
  /**
    * The endpoint to connect to.
    */
  var uri: java.lang.String
  /**
    * A custom WebSocket implementation to use.
    */
  var webSocketImpl: js.UndefOr[js.Any] = js.undefined
}

