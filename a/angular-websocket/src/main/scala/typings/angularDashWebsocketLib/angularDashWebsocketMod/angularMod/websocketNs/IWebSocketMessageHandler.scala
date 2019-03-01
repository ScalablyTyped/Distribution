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
    fn: js.Function1[stdLib.MessageEvent, scala.Unit],
    pattern: java.lang.String | stdLib.RegExp = null
  ): IWebSocketMessageHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoApply")(autoApply)
    __obj.updateDynamic("fn")(fn)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketMessageHandler]
  }
}

