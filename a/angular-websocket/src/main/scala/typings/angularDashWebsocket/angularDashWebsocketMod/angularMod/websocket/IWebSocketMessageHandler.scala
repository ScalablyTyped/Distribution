package typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocket

import typings.std.MessageEvent
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Type corresponding to onMessage callbacks stored in $Websocket#onMessageCallbacks instance. */
trait IWebSocketMessageHandler extends js.Object {
  var autoApply: Boolean
  var pattern: js.UndefOr[String | RegExp] = js.undefined
  def fn(evt: MessageEvent): Unit
}

object IWebSocketMessageHandler {
  @scala.inline
  def apply(autoApply: Boolean, fn: MessageEvent => Unit, pattern: String | RegExp = null): IWebSocketMessageHandler = {
    val __obj = js.Dynamic.literal(autoApply = autoApply.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn))
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketMessageHandler]
  }
}

