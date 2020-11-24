package typings.ava.pluginMod.SharedWorker.Experimental

import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastMessage[Data] extends js.Object {
  
  val id: String = js.native
  
  def replies(): AsyncIterableIterator[ReceivedMessage[Data]] = js.native
}
object BroadcastMessage {
  
  @scala.inline
  def apply[Data](id: String, replies: () => AsyncIterableIterator[ReceivedMessage[Data]]): BroadcastMessage[Data] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], replies = js.Any.fromFunction0(replies))
    __obj.asInstanceOf[BroadcastMessage[Data]]
  }
  
  @scala.inline
  implicit class BroadcastMessageOps[Self <: BroadcastMessage[_], Data] (val x: Self with BroadcastMessage[Data]) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplies(value: () => AsyncIterableIterator[ReceivedMessage[Data]]): Self = this.set("replies", js.Any.fromFunction0(value))
  }
}
