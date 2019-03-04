package typings
package apolloDashLinkDashWsLib.libWebSocketLinkMod.WebSocketLinkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var options: js.UndefOr[subscriptionsDashTransportDashWsLib.distClientMod.ClientOptions] = js.undefined
  var uri: java.lang.String
  var webSocketImpl: js.UndefOr[js.Any] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    uri: java.lang.String,
    options: subscriptionsDashTransportDashWsLib.distClientMod.ClientOptions = null,
    webSocketImpl: js.Any = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (options != null) __obj.updateDynamic("options")(options)
    if (webSocketImpl != null) __obj.updateDynamic("webSocketImpl")(webSocketImpl)
    __obj.asInstanceOf[Configuration]
  }
}

