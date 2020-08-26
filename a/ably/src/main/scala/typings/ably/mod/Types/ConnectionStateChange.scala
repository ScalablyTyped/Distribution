package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionStateChange extends js.Object {
  var current: ConnectionState = js.native
  var previous: ConnectionState = js.native
  var reason: js.UndefOr[ErrorInfo] = js.native
  var retryIn: js.UndefOr[Double] = js.native
}

object ConnectionStateChange {
  @scala.inline
  def apply(current: ConnectionState, previous: ConnectionState): ConnectionStateChange = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStateChange]
  }
  @scala.inline
  implicit class ConnectionStateChangeOps[Self <: ConnectionStateChange] (val x: Self) extends AnyVal {
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
    def setCurrent(value: ConnectionState): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: ConnectionState): Self = this.set("previous", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: ErrorInfo): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRetryIn(value: Double): Self = this.set("retryIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryIn: Self = this.set("retryIn", js.undefined)
  }
  
}

