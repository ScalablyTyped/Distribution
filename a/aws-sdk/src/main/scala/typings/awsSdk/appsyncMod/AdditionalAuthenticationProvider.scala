package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalAuthenticationProvider extends js.Object {
  
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
  implicit class AdditionalAuthenticationProviderOps[Self <: AdditionalAuthenticationProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationType: Self = this.set("authenticationType", js.undefined)
    
    @scala.inline
    def setOpenIDConnectConfig(value: OpenIDConnectConfig): Self = this.set("openIDConnectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenIDConnectConfig: Self = this.set("openIDConnectConfig", js.undefined)
    
    @scala.inline
    def setUserPoolConfig(value: CognitoUserPoolConfig): Self = this.set("userPoolConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolConfig: Self = this.set("userPoolConfig", js.undefined)
  }
}
