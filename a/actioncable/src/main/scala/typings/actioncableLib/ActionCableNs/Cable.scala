package typings
package actioncableLib.ActionCableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cable extends js.Object {
  var subscriptions: Subscriptions
  def connect(): scala.Unit
  def disconnect(): scala.Unit
  def ensureActiveConnection(): scala.Unit
  def send(data: js.Any): scala.Unit
}

object Cable {
  @scala.inline
  def apply(
    connect: () => scala.Unit,
    disconnect: () => scala.Unit,
    ensureActiveConnection: () => scala.Unit,
    send: js.Any => scala.Unit,
    subscriptions: Subscriptions
  ): Cable = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), ensureActiveConnection = js.Any.fromFunction0(ensureActiveConnection), send = js.Any.fromFunction1(send), subscriptions = subscriptions)
  
    __obj.asInstanceOf[Cable]
  }
}

