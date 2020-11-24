package typings.absintheSocket.mod

import typings.phoenix.mod.Channel
import typings.phoenix.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbsintheSocket[T] extends js.Object {
  
  var channel: Channel = js.native
  
  var channelJoinCreated: Boolean = js.native
  
  var notifiers: js.Array[Notifier[T, js.Object]] = js.native
  
  var phoenixSocket: Socket = js.native
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
  
  @scala.inline
  implicit class AbsintheSocketOps[Self <: AbsintheSocket[_], T] (val x: Self with AbsintheSocket[T]) extends AnyVal {
    
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
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelJoinCreated(value: Boolean): Self = this.set("channelJoinCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifiersVarargs(value: (Notifier[T, js.Object])*): Self = this.set("notifiers", js.Array(value :_*))
    
    @scala.inline
    def setNotifiers(value: js.Array[Notifier[T, js.Object]]): Self = this.set("notifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoenixSocket(value: Socket): Self = this.set("phoenixSocket", value.asInstanceOf[js.Any])
  }
}
