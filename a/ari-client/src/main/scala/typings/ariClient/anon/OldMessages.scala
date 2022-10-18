package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldMessages extends StObject {
  
  var mailboxName: String
  
  var newMessages: Double
  
  var oldMessages: Double
}
object OldMessages {
  
  inline def apply(mailboxName: String, newMessages: Double, oldMessages: Double): OldMessages = {
    val __obj = js.Dynamic.literal(mailboxName = mailboxName.asInstanceOf[js.Any], newMessages = newMessages.asInstanceOf[js.Any], oldMessages = oldMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldMessages]
  }
  
  extension [Self <: OldMessages](x: Self) {
    
    inline def setMailboxName(value: String): Self = StObject.set(x, "mailboxName", value.asInstanceOf[js.Any])
    
    inline def setNewMessages(value: Double): Self = StObject.set(x, "newMessages", value.asInstanceOf[js.Any])
    
    inline def setOldMessages(value: Double): Self = StObject.set(x, "oldMessages", value.asInstanceOf[js.Any])
  }
}
