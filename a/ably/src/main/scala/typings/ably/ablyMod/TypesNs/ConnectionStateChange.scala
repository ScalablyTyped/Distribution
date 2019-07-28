package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStateChange extends js.Object {
  var current: ConnectionState
  var previous: ConnectionState
  var reason: js.UndefOr[ErrorInfo] = js.undefined
  var retryIn: js.UndefOr[Double] = js.undefined
}

object ConnectionStateChange {
  @scala.inline
  def apply(
    current: ConnectionState,
    previous: ConnectionState,
    reason: ErrorInfo = null,
    retryIn: Int | Double = null
  ): ConnectionStateChange = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (retryIn != null) __obj.updateDynamic("retryIn")(retryIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStateChange]
  }
}

