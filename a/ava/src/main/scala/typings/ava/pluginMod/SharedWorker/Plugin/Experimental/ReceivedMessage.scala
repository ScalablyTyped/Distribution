package typings.ava.pluginMod.SharedWorker.Plugin.Experimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceivedMessage[Data] extends js.Object {
  
  val data: Data = js.native
  
  val id: String = js.native
  
  def reply(data: Data): PublishedMessage[Data] = js.native
}
object ReceivedMessage {
  
  @scala.inline
  def apply[Data](data: Data, id: String, reply: Data => PublishedMessage[Data]): ReceivedMessage[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reply = js.Any.fromFunction1(reply))
    __obj.asInstanceOf[ReceivedMessage[Data]]
  }
  
  @scala.inline
  implicit class ReceivedMessageOps[Self <: ReceivedMessage[_], Data] (val x: Self with ReceivedMessage[Data]) extends AnyVal {
    
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
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply(value: Data => PublishedMessage[Data]): Self = this.set("reply", js.Any.fromFunction1(value))
  }
}
