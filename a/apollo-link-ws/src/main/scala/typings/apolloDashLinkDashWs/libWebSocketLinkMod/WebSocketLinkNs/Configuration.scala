package typings.apolloDashLinkDashWs.libWebSocketLinkMod.WebSocketLinkNs

import typings.subscriptionsDashTransportDashWs.distClientMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var options: js.UndefOr[ClientOptions] = js.undefined
  var uri: String
  var webSocketImpl: js.UndefOr[js.Any] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(uri: String, options: ClientOptions = null, webSocketImpl: js.Any = null): Configuration = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (options != null) __obj.updateDynamic("options")(options)
    if (webSocketImpl != null) __obj.updateDynamic("webSocketImpl")(webSocketImpl)
    __obj.asInstanceOf[Configuration]
  }
}

