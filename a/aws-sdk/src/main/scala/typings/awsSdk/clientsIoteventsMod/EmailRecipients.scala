package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailRecipients extends StObject {
  
  /**
    * Specifies one or more recipients who receive the email.
    */
  var to: js.UndefOr[RecipientDetails] = js.undefined
}
object EmailRecipients {
  
  inline def apply(): EmailRecipients = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailRecipients]
  }
  
  extension [Self <: EmailRecipients](x: Self) {
    
    inline def setTo(value: RecipientDetails): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(value: RecipientDetail*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
