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

