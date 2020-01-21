package typings.apolloLinkWs.webSocketLinkMod.WebSocketLink

import typings.subscriptionsTransportWs.clientMod.ClientOptions
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
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (webSocketImpl != null) __obj.updateDynamic("webSocketImpl")(webSocketImpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

