package typings.acmeClient.typesRfc8555Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCreateRequest extends StObject {
  
  var contact: js.UndefOr[js.Array[String]] = js.undefined
  
  var externalAccountBinding: js.UndefOr[js.Object] = js.undefined
  
  var onlyReturnExisting: js.UndefOr[Boolean] = js.undefined
  
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
}
object AccountCreateRequest {
  
  inline def apply(): AccountCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCreateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountCreateRequest] (val x: Self) extends AnyVal {
    
    inline def setContact(value: js.Array[String]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: String*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setExternalAccountBinding(value: js.Object): Self = StObject.set(x, "externalAccountBinding", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountBindingUndefined: Self = StObject.set(x, "externalAccountBinding", js.undefined)
    
    inline def setOnlyReturnExisting(value: Boolean): Self = StObject.set(x, "onlyReturnExisting", value.asInstanceOf[js.Any])
    
    inline def setOnlyReturnExistingUndefined: Self = StObject.set(x, "onlyReturnExisting", js.undefined)
    
    inline def setTermsOfServiceAgreed(value: Boolean): Self = StObject.set(x, "termsOfServiceAgreed", value.asInstanceOf[js.Any])
    
    inline def setTermsOfServiceAgreedUndefined: Self = StObject.set(x, "termsOfServiceAgreed", js.undefined)
  }
}
