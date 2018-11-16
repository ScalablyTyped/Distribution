package typings
package angularDashWebsocketLib.angularDashWebsocketMod.angularMod.websocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Type corresponding to items stored in $WebSocket#sendQueue instance. */

trait IWebSocketQueueItem extends js.Object {
  var defered: angularLib.angularMod.angularNs.IPromise[scala.Unit]
  var message: js.Any
}

