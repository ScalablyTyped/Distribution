package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityProviderConfigResponse extends StObject {
  
  /**
    * The object that represents an OpenID Connect (OIDC) identity provider configuration.
    */
  var identityProviderConfig: js.UndefOr[IdentityProviderConfigResponse] = js.undefined
}
object DescribeIdentityProviderConfigResponse {
  
  inline def apply(): DescribeIdentityProviderConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityProviderConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeIdentityProviderConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentityProviderConfig(value: IdentityProviderConfigResponse): Self = StObject.set(x, "identityProviderConfig", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderConfigUndefined: Self = StObject.set(x, "identityProviderConfig", js.undefined)
  }
}
