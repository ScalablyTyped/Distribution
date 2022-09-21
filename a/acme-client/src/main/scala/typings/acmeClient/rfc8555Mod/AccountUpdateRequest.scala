package typings.acmeClient.rfc8555Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountUpdateRequest extends StObject {
  
  var contact: js.UndefOr[js.Array[String]] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
}
object AccountUpdateRequest {
  
  inline def apply(): AccountUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUpdateRequest]
  }
  
  extension [Self <: AccountUpdateRequest](x: Self) {
    
    inline def setContact(value: js.Array[String]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: String*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTermsOfServiceAgreed(value: Boolean): Self = StObject.set(x, "termsOfServiceAgreed", value.asInstanceOf[js.Any])
    
    inline def setTermsOfServiceAgreedUndefined: Self = StObject.set(x, "termsOfServiceAgreed", js.undefined)
  }
}
