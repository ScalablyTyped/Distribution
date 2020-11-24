package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGraphqlApiRequest extends js.Object {
  
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.native
  
  /**
    * The API ID.
    */
  var apiId: String = js.native
  
  /**
    * The new authentication type for the GraphqlApi object.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.native
  
  /**
    * The Amazon CloudWatch Logs configuration for the GraphqlApi object.
    */
  var logConfig: js.UndefOr[LogConfig] = js.native
  
  /**
    * The new name for the GraphqlApi object.
    */
  var name: String = js.native
  
  /**
    * The OpenID Connect configuration for the GraphqlApi object.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.native
  
  /**
    * The new Amazon Cognito user pool configuration for the GraphqlApi object.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.native
  
  /**
    * A flag indicating whether to enable X-Ray tracing for the GraphqlApi.
    */
  var xrayEnabled: js.UndefOr[Boolean] = js.native
}
object UpdateGraphqlApiRequest {
  
  @scala.inline
  def apply(apiId: String, name: String): UpdateGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGraphqlApiRequest]
  }
  
  @scala.inline
  implicit class UpdateGraphqlApiRequestOps[Self <: UpdateGraphqlApiRequest] (val x: Self) extends AnyVal {
    
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
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalAuthenticationProvidersVarargs(value: AdditionalAuthenticationProvider*): Self = this.set("additionalAuthenticationProviders", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalAuthenticationProviders(value: AdditionalAuthenticationProviders): Self = this.set("additionalAuthenticationProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalAuthenticationProviders: Self = this.set("additionalAuthenticationProviders", js.undefined)
    
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationType: Self = this.set("authenticationType", js.undefined)
    
    @scala.inline
    def setLogConfig(value: LogConfig): Self = this.set("logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogConfig: Self = this.set("logConfig", js.undefined)
    
    @scala.inline
    def setOpenIDConnectConfig(value: OpenIDConnectConfig): Self = this.set("openIDConnectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenIDConnectConfig: Self = this.set("openIDConnectConfig", js.undefined)
    
    @scala.inline
    def setUserPoolConfig(value: UserPoolConfig): Self = this.set("userPoolConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolConfig: Self = this.set("userPoolConfig", js.undefined)
    
    @scala.inline
    def setXrayEnabled(value: Boolean): Self = this.set("xrayEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXrayEnabled: Self = this.set("xrayEnabled", js.undefined)
  }
}
