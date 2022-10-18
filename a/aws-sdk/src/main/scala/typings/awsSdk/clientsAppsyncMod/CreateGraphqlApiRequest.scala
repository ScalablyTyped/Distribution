package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGraphqlApiRequest extends StObject {
  
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.undefined
  
  /**
    * The authentication type: API key, Identity and Access Management (IAM), OpenID Connect (OIDC), Amazon Cognito user pools, or Lambda.
    */
  var authenticationType: AuthenticationType
  
  /**
    * Configuration for Lambda function authorization.
    */
  var lambdaAuthorizerConfig: js.UndefOr[LambdaAuthorizerConfig] = js.undefined
  
  /**
    * The Amazon CloudWatch Logs configuration.
    */
  var logConfig: js.UndefOr[LogConfig] = js.undefined
  
  /**
    * A user-supplied name for the GraphqlApi.
    */
  var name: String
  
  /**
    * The OIDC configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
  
  /**
    * A TagMap object.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
  
  /**
    * A flag indicating whether to use X-Ray tracing for the GraphqlApi.
    */
  var xrayEnabled: js.UndefOr[Boolean] = js.undefined
}
object CreateGraphqlApiRequest {
  
  inline def apply(authenticationType: AuthenticationType, name: String): CreateGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGraphqlApiRequest]
  }
  
  extension [Self <: CreateGraphqlApiRequest](x: Self) {
    
    inline def setAdditionalAuthenticationProviders(value: AdditionalAuthenticationProviders): Self = StObject.set(x, "additionalAuthenticationProviders", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthenticationProvidersUndefined: Self = StObject.set(x, "additionalAuthenticationProviders", js.undefined)
    
    inline def setAdditionalAuthenticationProvidersVarargs(value: AdditionalAuthenticationProvider*): Self = StObject.set(x, "additionalAuthenticationProviders", js.Array(value*))
    
    inline def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setLambdaAuthorizerConfig(value: LambdaAuthorizerConfig): Self = StObject.set(x, "lambdaAuthorizerConfig", value.asInstanceOf[js.Any])
    
    inline def setLambdaAuthorizerConfigUndefined: Self = StObject.set(x, "lambdaAuthorizerConfig", js.undefined)
    
    inline def setLogConfig(value: LogConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    inline def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpenIDConnectConfig(value: OpenIDConnectConfig): Self = StObject.set(x, "openIDConnectConfig", value.asInstanceOf[js.Any])
    
    inline def setOpenIDConnectConfigUndefined: Self = StObject.set(x, "openIDConnectConfig", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUserPoolConfig(value: UserPoolConfig): Self = StObject.set(x, "userPoolConfig", value.asInstanceOf[js.Any])
    
    inline def setUserPoolConfigUndefined: Self = StObject.set(x, "userPoolConfig", js.undefined)
    
    inline def setXrayEnabled(value: Boolean): Self = StObject.set(x, "xrayEnabled", value.asInstanceOf[js.Any])
    
    inline def setXrayEnabledUndefined: Self = StObject.set(x, "xrayEnabled", js.undefined)
  }
}
