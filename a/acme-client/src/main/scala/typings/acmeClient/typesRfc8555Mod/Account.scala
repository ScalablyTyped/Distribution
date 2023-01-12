package typings.acmeClient.typesRfc8555Mod

import typings.acmeClient.acmeClientStrings.deactivated
import typings.acmeClient.acmeClientStrings.revoked
import typings.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  var contact: js.UndefOr[js.Array[String]] = js.undefined
  
  var externalAccountBinding: js.UndefOr[js.Object] = js.undefined
  
  var orders: String
  
  var status: valid | deactivated | revoked
  
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
}
object Account {
  
  inline def apply(orders: String, status: valid | deactivated | revoked): Account = {
    val __obj = js.Dynamic.literal(orders = orders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    inline def setContact(value: js.Array[String]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: String*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setExternalAccountBinding(value: js.Object): Self = StObject.set(x, "externalAccountBinding", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountBindingUndefined: Self = StObject.set(x, "externalAccountBinding", js.undefined)
    
    inline def setOrders(value: String): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: valid | deactivated | revoked): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTermsOfServiceAgreed(value: Boolean): Self = StObject.set(x, "termsOfServiceAgreed", value.asInstanceOf[js.Any])
    
    inline def setTermsOfServiceAgreedUndefined: Self = StObject.set(x, "termsOfServiceAgreed", js.undefined)
  }
}
