package typings.acmeClient.rfc8555Mod

import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.processing
import typings.acmeClient.acmeClientStrings.ready
import typings.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order extends StObject {
  
  var authorizations: js.Array[String] = js.native
  
  var certificate: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[js.Object] = js.native
  
  var expires: js.UndefOr[String] = js.native
  
  @JSName("finalize")
  var finalize_FOrder: String = js.native
  
  var identifiers: js.Array[Identifier] = js.native
  
  var notAfter: js.UndefOr[String] = js.native
  
  var notBefore: js.UndefOr[String] = js.native
  
  var status: pending | ready | processing | valid | invalid = js.native
}
object Order {
  
  @scala.inline
  def apply(
    authorizations: js.Array[String],
    finalize_ : String,
    identifiers: js.Array[Identifier],
    status: pending | ready | processing | valid | invalid
  ): Order = {
    val __obj = js.Dynamic.literal(authorizations = authorizations.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("finalize")(finalize_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit class OrderMutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizations(value: js.Array[String]): Self = StObject.set(x, "authorizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationsVarargs(value: String*): Self = StObject.set(x, "authorizations", js.Array(value :_*))
    
    @scala.inline
    def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setError(value: js.Object): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setFinalize_(value: String): Self = StObject.set(x, "finalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifiers(value: js.Array[Identifier]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifiersVarargs(value: Identifier*): Self = StObject.set(x, "identifiers", js.Array(value :_*))
    
    @scala.inline
    def setNotAfter(value: String): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: String): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    @scala.inline
    def setStatus(value: pending | ready | processing | valid | invalid): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
