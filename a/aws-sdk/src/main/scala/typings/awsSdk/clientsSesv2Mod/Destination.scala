package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
    */
  var BccAddresses: js.UndefOr[EmailAddressList] = js.undefined
  
  /**
    * An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
    */
  var CcAddresses: js.UndefOr[EmailAddressList] = js.undefined
  
  /**
    * An array that contains the email addresses of the "To" recipients for the email.
    */
  var ToAddresses: js.UndefOr[EmailAddressList] = js.undefined
}
object Destination {
  
  inline def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    inline def setBccAddresses(value: EmailAddressList): Self = StObject.set(x, "BccAddresses", value.asInstanceOf[js.Any])
    
    inline def setBccAddressesUndefined: Self = StObject.set(x, "BccAddresses", js.undefined)
    
    inline def setBccAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "BccAddresses", js.Array(value*))
    
    inline def setCcAddresses(value: EmailAddressList): Self = StObject.set(x, "CcAddresses", value.asInstanceOf[js.Any])
    
    inline def setCcAddressesUndefined: Self = StObject.set(x, "CcAddresses", js.undefined)
    
    inline def setCcAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "CcAddresses", js.Array(value*))
    
    inline def setToAddresses(value: EmailAddressList): Self = StObject.set(x, "ToAddresses", value.asInstanceOf[js.Any])
    
    inline def setToAddressesUndefined: Self = StObject.set(x, "ToAddresses", js.undefined)
    
    inline def setToAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "ToAddresses", js.Array(value*))
  }
}
