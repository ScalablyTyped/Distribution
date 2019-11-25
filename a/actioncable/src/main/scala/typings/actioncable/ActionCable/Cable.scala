package typings.actioncable.ActionCable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cable extends js.Object {
  var subscriptions: Subscriptions
  def connect(): Unit
  def disconnect(): Unit
  def ensureActiveConnection(): Unit
  def send(data: js.Any): Unit
}

object Cable {
  @scala.inline
  def apply(
    connect: () => Unit,
    disconnect: () => Unit,
    ensureActiveConnection: () => Unit,
    send: js.Any => Unit,
    subscriptions: Subscriptions
  ): Cable = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), ensureActiveConnection = js.Any.fromFunction0(ensureActiveConnection), send = js.Any.fromFunction1(send), subscriptions = subscriptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cable]
  }
}

