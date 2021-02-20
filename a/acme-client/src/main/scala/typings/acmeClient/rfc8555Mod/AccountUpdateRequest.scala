package typings.acmeClient.rfc8555Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUpdateRequest extends StObject {
  
  var contact: js.UndefOr[js.Array[String]] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.native
}
object AccountUpdateRequest {
  
  @scala.inline
  def apply(): AccountUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUpdateRequest]
  }
  
  @scala.inline
  implicit class AccountUpdateRequestMutableBuilder[Self <: AccountUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: js.Array[String]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: String*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTermsOfServiceAgreed(value: Boolean): Self = StObject.set(x, "termsOfServiceAgreed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsOfServiceAgreedUndefined: Self = StObject.set(x, "termsOfServiceAgreed", js.undefined)
  }
}
