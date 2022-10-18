package typings.acmeClient.typesRfc8555Mod

import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.processing
import typings.acmeClient.acmeClientStrings.ready
import typings.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  var authorizations: js.Array[String]
  
  var certificate: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[js.Object] = js.undefined
  
  var expires: js.UndefOr[String] = js.undefined
  
  @JSName("finalize")
  var finalize_FOrder: String
  
  var identifiers: js.Array[Identifier]
  
  var notAfter: js.UndefOr[String] = js.undefined
  
  var notBefore: js.UndefOr[String] = js.undefined
  
  var status: pending | ready | processing | valid | invalid
}
object Order {
  
  inline def apply(
    authorizations: js.Array[String],
    finalize_ : String,
    identifiers: js.Array[Identifier],
    status: pending | ready | processing | valid | invalid
  ): Order = {
    val __obj = js.Dynamic.literal(authorizations = authorizations.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("finalize")(finalize_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setAuthorizations(value: js.Array[String]): Self = StObject.set(x, "authorizations", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationsVarargs(value: String*): Self = StObject.set(x, "authorizations", js.Array(value*))
    
    inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setError(value: js.Object): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setFinalize_(value: String): Self = StObject.set(x, "finalize", value.asInstanceOf[js.Any])
    
    inline def setIdentifiers(value: js.Array[Identifier]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersVarargs(value: Identifier*): Self = StObject.set(x, "identifiers", js.Array(value*))
    
    inline def setNotAfter(value: String): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    inline def setNotBefore(value: String): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    inline def setStatus(value: pending | ready | processing | valid | invalid): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
