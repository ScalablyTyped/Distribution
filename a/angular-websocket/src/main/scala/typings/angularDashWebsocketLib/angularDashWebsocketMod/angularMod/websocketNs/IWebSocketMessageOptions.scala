package typings
package angularDashWebsocketLib.angularDashWebsocketMod.angularMod.websocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options available to be specified for IWebSocket.onMessage */

trait IWebSocketMessageOptions extends js.Object {
  /** If true, each message handled will safely call `$rootScope.$digest()`. */
  var autoApply: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * If specified, only messages that match the filter will cause the message event
               * to be fired.
               */
  var filter: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
}

