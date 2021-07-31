package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphqlApi extends StObject {
  
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.undefined
  
  /**
    * The API ID.
    */
  var apiId: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The authentication type.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.undefined
  
  /**
    * The Amazon CloudWatch Logs configuration.
    */
  var logConfig: js.UndefOr[LogConfig] = js.undefined
  
  /**
    * The API name.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The OpenID Connect configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
  
  /**
    * The tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The URIs.
    */
  var uris: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
  
  /**
    * The ARN of the AWS Web Application Firewall (WAF) ACL associated with this GraphqlApi, if one exists.
    */
  var wafWebAclArn: js.UndefOr[String] = js.undefined
  
  /**
    * A flag representing whether X-Ray tracing is enabled for this GraphqlApi.
    */
  var xrayEnabled: js.UndefOr[Boolean] = js.undefined
}
object GraphqlApi {
  
  @scala.inline
  def apply(): GraphqlApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphqlApi]
  }
  
  @scala.inline
  implicit class GraphqlApiMutableBuilder[Self <: GraphqlApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalAuthenticationProviders(value: AdditionalAuthenticationProviders): Self = StObject.set(x, "additionalAuthenticationProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalAuthenticationProvidersUndefined: Self = StObject.set(x, "additionalAuthenticationProviders", js.undefined)
    
    @scala.inline
    def setAdditionalAuthenticationProvidersVarargs(value: AdditionalAuthenticationProvider*): Self = StObject.set(x, "additionalAuthenticationProviders", js.Array(value :_*))
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    @scala.inline
    def setLogConfig(value: LogConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpenIDConnectConfig(value: OpenIDConnectConfig): Self = StObject.set(x, "openIDConnectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIDConnectConfigUndefined: Self = StObject.set(x, "openIDConnectConfig", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setUris(value: MapOfStringToString): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    @scala.inline
    def setUserPoolConfig(value: UserPoolConfig): Self = StObject.set(x, "userPoolConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolConfigUndefined: Self = StObject.set(x, "userPoolConfig", js.undefined)
    
    @scala.inline
    def setWafWebAclArn(value: String): Self = StObject.set(x, "wafWebAclArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWafWebAclArnUndefined: Self = StObject.set(x, "wafWebAclArn", js.undefined)
    
    @scala.inline
    def setXrayEnabled(value: Boolean): Self = StObject.set(x, "xrayEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrayEnabledUndefined: Self = StObject.set(x, "xrayEnabled", js.undefined)
  }
}
