package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGraphqlApiRequest extends StObject {
  
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.undefined
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The new authentication type for the GraphqlApi object.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.undefined
  
  /**
    * The Amazon CloudWatch Logs configuration for the GraphqlApi object.
    */
  var logConfig: js.UndefOr[LogConfig] = js.undefined
  
  /**
    * The new name for the GraphqlApi object.
    */
  var name: String
  
  /**
    * The OpenID Connect configuration for the GraphqlApi object.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
  
  /**
    * The new Amazon Cognito user pool configuration for the GraphqlApi object.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
  
  /**
    * A flag indicating whether to enable X-Ray tracing for the GraphqlApi.
    */
  var xrayEnabled: js.UndefOr[Boolean] = js.undefined
}
object UpdateGraphqlApiRequest {
  
  @scala.inline
  def apply(apiId: String, name: String): UpdateGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGraphqlApiRequest]
  }
  
  @scala.inline
  implicit class UpdateGraphqlApiRequestMutableBuilder[Self <: UpdateGraphqlApiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalAuthenticationProviders(value: AdditionalAuthenticationProviders): Self = StObject.set(x, "additionalAuthenticationProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalAuthenticationProvidersUndefined: Self = StObject.set(x, "additionalAuthenticationProviders", js.undefined)
    
    @scala.inline
    def setAdditionalAuthenticationProvidersVarargs(value: AdditionalAuthenticationProvider*): Self = StObject.set(x, "additionalAuthenticationProviders", js.Array(value :_*))
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    @scala.inline
    def setLogConfig(value: LogConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIDConnectConfig(value: OpenIDConnectConfig): Self = StObject.set(x, "openIDConnectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIDConnectConfigUndefined: Self = StObject.set(x, "openIDConnectConfig", js.undefined)
    
    @scala.inline
    def setUserPoolConfig(value: UserPoolConfig): Self = StObject.set(x, "userPoolConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolConfigUndefined: Self = StObject.set(x, "userPoolConfig", js.undefined)
    
    @scala.inline
    def setXrayEnabled(value: Boolean): Self = StObject.set(x, "xrayEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrayEnabledUndefined: Self = StObject.set(x, "xrayEnabled", js.undefined)
  }
}
