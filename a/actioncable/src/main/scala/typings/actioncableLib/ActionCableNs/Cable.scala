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
    connect: js.Function0[scala.Unit],
    disconnect: js.Function0[scala.Unit],
    ensureActiveConnection: js.Function0[scala.Unit],
    send: js.Function1[js.Any, scala.Unit],
    subscriptions: Subscriptions
  ): Cable = {
    val __obj = js.Dynamic.literal(connect = connect, disconnect = disconnect, ensureActiveConnection = ensureActiveConnection, send = send, subscriptions = subscriptions)
  
    __obj.asInstanceOf[Cable]
  }
}

