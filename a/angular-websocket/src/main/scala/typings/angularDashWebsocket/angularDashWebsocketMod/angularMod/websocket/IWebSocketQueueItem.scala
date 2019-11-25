package typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocket

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Type corresponding to items stored in $WebSocket#sendQueue instance. */
trait IWebSocketQueueItem extends js.Object {
  var defered: IPromise[Unit]
  var message: js.Any
}

object IWebSocketQueueItem {
  @scala.inline
  def apply(defered: IPromise[Unit], message: js.Any): IWebSocketQueueItem = {
    val __obj = js.Dynamic.literal(defered = defered.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWebSocketQueueItem]
  }
}

