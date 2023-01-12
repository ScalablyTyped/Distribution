package typings.auth0.mod

import typings.auth0.anon.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailVerificationTicketOptions extends StObject {
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var identity: js.UndefOr[Provider] = js.undefined
  
  var includeEmailInRedirect: js.UndefOr[Boolean] = js.undefined
  
  var organization_id: js.UndefOr[String] = js.undefined
  
  var result_url: js.UndefOr[String] = js.undefined
  
  var ttl_sec: js.UndefOr[Double] = js.undefined
  
  var user_id: String
}
object EmailVerificationTicketOptions {
  
  inline def apply(user_id: String): EmailVerificationTicketOptions = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailVerificationTicketOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailVerificationTicketOptions] (val x: Self) extends AnyVal {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setIdentity(value: Provider): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setIncludeEmailInRedirect(value: Boolean): Self = StObject.set(x, "includeEmailInRedirect", value.asInstanceOf[js.Any])
    
    inline def setIncludeEmailInRedirectUndefined: Self = StObject.set(x, "includeEmailInRedirect", js.undefined)
    
    inline def setOrganization_id(value: String): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
    
    inline def setOrganization_idUndefined: Self = StObject.set(x, "organization_id", js.undefined)
    
    inline def setResult_url(value: String): Self = StObject.set(x, "result_url", value.asInstanceOf[js.Any])
    
    inline def setResult_urlUndefined: Self = StObject.set(x, "result_url", js.undefined)
    
    inline def setTtl_sec(value: Double): Self = StObject.set(x, "ttl_sec", value.asInstanceOf[js.Any])
    
    inline def setTtl_secUndefined: Self = StObject.set(x, "ttl_sec", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
