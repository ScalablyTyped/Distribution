package typings
package angularDashWebsocketLib.angularDashWebsocketMod.angularMod.websocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Type corresponding to onMessage callbacks stored in $Websocket#onMessageCallbacks instance. */
trait IWebSocketMessageHandler extends js.Object {
  var autoApply: scala.Boolean
  var pattern: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  def fn(evt: stdLib.MessageEvent): scala.Unit
}

object IWebSocketMessageHandler {
  @scala.inline
  def apply(
    autoApply: scala.Boolean,
    fn: stdLib.MessageEvent => scala.Unit,
    pattern: java.lang.String | stdLib.RegExp = null
  ): IWebSocketMessageHandler = {
    val __obj = js.Dynamic.literal(autoApply = autoApply, fn = js.Any.fromFunction1(fn))
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketMessageHandler]
  }
}

