package typings.absintheSocket.mod

import typings.phoenix.mod.Channel
import typings.phoenix.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbsintheSocket[T] extends js.Object {
  var channel: Channel
  var channelJoinCreated: Boolean
  var notifiers: js.Array[Notifier[T, js.Object]]
  var phoenixSocket: Socket
}

object AbsintheSocket {
  @scala.inline
  def apply[T](
    channel: Channel,
    channelJoinCreated: Boolean,
    notifiers: js.Array[Notifier[T, js.Object]],
    phoenixSocket: Socket
  ): AbsintheSocket[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], channelJoinCreated = channelJoinCreated.asInstanceOf[js.Any], notifiers = notifiers.asInstanceOf[js.Any], phoenixSocket = phoenixSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsintheSocket[T]]
  }
}

