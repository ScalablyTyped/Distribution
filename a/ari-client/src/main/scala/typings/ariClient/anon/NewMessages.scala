package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewMessages extends StObject {
  
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
  implicit class NewMessagesMutableBuilder[Self <: NewMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMailboxName(value: String): Self = StObject.set(x, "mailboxName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewMessages(value: Double): Self = StObject.set(x, "newMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldMessages(value: Double): Self = StObject.set(x, "oldMessages", value.asInstanceOf[js.Any])
  }
}
