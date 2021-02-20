package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalAuthenticationProvider extends StObject {
  
  /**
    * The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.native
  
  /**
    * The OpenID Connect configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.native
  
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[CognitoUserPoolConfig] = js.native
}
object AdditionalAuthenticationProvider {
  
  @scala.inline
  def apply(): AdditionalAuthenticationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalAuthenticationProvider]
  }
  
  @scala.inline
  implicit class AdditionalAuthenticationProviderMutableBuilder[Self <: AdditionalAuthenticationProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    @scala.inline
    def setOpenIDConnectConfig(value: OpenIDConnectConfig): Self = StObject.set(x, "openIDConnectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIDConnectConfigUndefined: Self = StObject.set(x, "openIDConnectConfig", js.undefined)
    
    @scala.inline
    def setUserPoolConfig(value: CognitoUserPoolConfig): Self = StObject.set(x, "userPoolConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolConfigUndefined: Self = StObject.set(x, "userPoolConfig", js.undefined)
  }
}
