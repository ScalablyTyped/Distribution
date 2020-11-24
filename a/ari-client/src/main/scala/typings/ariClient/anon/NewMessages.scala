package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewMessages extends js.Object {
  
  var mailboxName: String = js.native
  
  var newMessages: Double = js.native
  
  var oldMessages: Double = js.native
}
object NewMessages {
  
  @scala.inline
  def apply(mailboxName: String, newMessages: Double, oldMessages: Double): NewMessages = {
    val __obj = js.Dynamic.literal(mailboxName = mailboxName.asInstanceOf[js.Any], newMessages = newMessages.asInstanceOf[js.Any], oldMessages = oldMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewMessages]
  }
  
  @scala.inline
  implicit class NewMessagesOps[Self <: NewMessages] (val x: Self) extends AnyVal {
    
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
    def setMailboxName(value: String): Self = this.set("mailboxName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewMessages(value: Double): Self = this.set("newMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldMessages(value: Double): Self = this.set("oldMessages", value.asInstanceOf[js.Any])
  }
}
