package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxName extends StObject {
  
  var mailboxName: String
}
object MailboxName {
  
  @scala.inline
  def apply(mailboxName: String): MailboxName = {
    val __obj = js.Dynamic.literal(mailboxName = mailboxName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailboxName]
  }
  
  @scala.inline
  implicit class MailboxNameMutableBuilder[Self <: MailboxName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMailboxName(value: String): Self = StObject.set(x, "mailboxName", value.asInstanceOf[js.Any])
  }
}
