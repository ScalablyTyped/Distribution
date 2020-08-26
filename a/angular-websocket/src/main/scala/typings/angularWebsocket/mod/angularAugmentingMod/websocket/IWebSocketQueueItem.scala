package typings.angularWebsocket.mod.angularAugmentingMod.websocket

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Type corresponding to items stored in $WebSocket#sendQueue instance. */
@js.native
trait IWebSocketQueueItem extends js.Object {
  var defered: IPromise[Unit] = js.native
  var message: js.Any = js.native
}

object IWebSocketQueueItem {
  @scala.inline
  def apply(defered: IPromise[Unit], message: js.Any): IWebSocketQueueItem = {
    val __obj = js.Dynamic.literal(defered = defered.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketQueueItem]
  }
  @scala.inline
  implicit class IWebSocketQueueItemOps[Self <: IWebSocketQueueItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefered(value: IPromise[Unit]): Self = this.set("defered", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

