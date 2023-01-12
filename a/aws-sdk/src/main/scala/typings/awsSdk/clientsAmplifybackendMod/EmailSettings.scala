package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailSettings extends StObject {
  
  /**
    * The contents of the email message.
    */
  var EmailMessage: js.UndefOr[string] = js.undefined
  
  /**
    * The contents of the subject line of the email message.
    */
  var EmailSubject: js.UndefOr[string] = js.undefined
}
object EmailSettings {
  
  inline def apply(): EmailSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailSettings] (val x: Self) extends AnyVal {
    
    inline def setEmailMessage(value: string): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
    
    inline def setEmailSubject(value: string): Self = StObject.set(x, "EmailSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailSubjectUndefined: Self = StObject.set(x, "EmailSubject", js.undefined)
  }
}
