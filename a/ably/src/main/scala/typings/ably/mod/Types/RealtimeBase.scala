package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeBase extends RestBase {
  var clientId: String
  def close(): Unit
  def connect(): Unit
}

object RealtimeBase {
  @scala.inline
  def apply(clientId: String, close: () => Unit, connect: () => Unit): RealtimeBase = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect))
    __obj.asInstanceOf[RealtimeBase]
  }
}

