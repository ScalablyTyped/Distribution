package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxName extends StObject {
  
  var mailboxName: String
}
object MailboxName {
  
  inline def apply(mailboxName: String): MailboxName = {
    val __obj = js.Dynamic.literal(mailboxName = mailboxName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailboxName]
  }
  
  extension [Self <: MailboxName](x: Self) {
    
    inline def setMailboxName(value: String): Self = StObject.set(x, "mailboxName", value.asInstanceOf[js.Any])
  }
}
