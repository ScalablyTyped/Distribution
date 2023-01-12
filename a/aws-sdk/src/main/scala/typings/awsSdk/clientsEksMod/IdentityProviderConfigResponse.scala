package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProviderConfigResponse extends StObject {
  
  /**
    * An object representing an OpenID Connect (OIDC) identity provider configuration.
    */
  var oidc: js.UndefOr[OidcIdentityProviderConfig] = js.undefined
}
object IdentityProviderConfigResponse {
  
  inline def apply(): IdentityProviderConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityProviderConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setOidc(value: OidcIdentityProviderConfig): Self = StObject.set(x, "oidc", value.asInstanceOf[js.Any])
    
    inline def setOidcUndefined: Self = StObject.set(x, "oidc", js.undefined)
  }
}
