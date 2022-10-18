package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OidcIdentityProviderConfig extends StObject {
  
  /**
    * This is also known as audience. The ID of the client application that makes authentication requests to the OIDC identity provider.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster that the configuration is associated to.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /**
    * The JSON web token (JWT) claim that the provider uses to return your groups.
    */
  var groupsClaim: js.UndefOr[String] = js.undefined
  
  /**
    * The prefix that is prepended to group claims to prevent clashes with existing names (such as system: groups). For example, the value oidc: creates group names like oidc:engineering and oidc:infra. The prefix can't contain system: 
    */
  var groupsPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the configuration.
    */
  var identityProviderConfigArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the configuration.
    */
  var identityProviderConfigName: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the OIDC identity provider that allows the API server to discover public signing keys for verifying tokens.
    */
  var issuerUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The key-value pairs that describe required claims in the identity token. If set, each claim is verified to be present in the token with a matching value.
    */
  var requiredClaims: js.UndefOr[requiredClaimsMap] = js.undefined
  
  /**
    * The status of the OIDC identity provider.
    */
  var status: js.UndefOr[configStatus] = js.undefined
  
  /**
    * The metadata to apply to the provider configuration to assist with categorization and organization. Each tag consists of a key and an optional value. You define both.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The JSON Web token (JWT) claim that is used as the username.
    */
  var usernameClaim: js.UndefOr[String] = js.undefined
  
  /**
    * The prefix that is prepended to username claims to prevent clashes with existing names. The prefix can't contain system: 
    */
  var usernamePrefix: js.UndefOr[String] = js.undefined
}
object OidcIdentityProviderConfig {
  
  inline def apply(): OidcIdentityProviderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OidcIdentityProviderConfig]
  }
  
  extension [Self <: OidcIdentityProviderConfig](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setGroupsClaim(value: String): Self = StObject.set(x, "groupsClaim", value.asInstanceOf[js.Any])
    
    inline def setGroupsClaimUndefined: Self = StObject.set(x, "groupsClaim", js.undefined)
    
    inline def setGroupsPrefix(value: String): Self = StObject.set(x, "groupsPrefix", value.asInstanceOf[js.Any])
    
    inline def setGroupsPrefixUndefined: Self = StObject.set(x, "groupsPrefix", js.undefined)
    
    inline def setIdentityProviderConfigArn(value: String): Self = StObject.set(x, "identityProviderConfigArn", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderConfigArnUndefined: Self = StObject.set(x, "identityProviderConfigArn", js.undefined)
    
    inline def setIdentityProviderConfigName(value: String): Self = StObject.set(x, "identityProviderConfigName", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderConfigNameUndefined: Self = StObject.set(x, "identityProviderConfigName", js.undefined)
    
    inline def setIssuerUrl(value: String): Self = StObject.set(x, "issuerUrl", value.asInstanceOf[js.Any])
    
    inline def setIssuerUrlUndefined: Self = StObject.set(x, "issuerUrl", js.undefined)
    
    inline def setRequiredClaims(value: requiredClaimsMap): Self = StObject.set(x, "requiredClaims", value.asInstanceOf[js.Any])
    
    inline def setRequiredClaimsUndefined: Self = StObject.set(x, "requiredClaims", js.undefined)
    
    inline def setStatus(value: configStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUsernameClaim(value: String): Self = StObject.set(x, "usernameClaim", value.asInstanceOf[js.Any])
    
    inline def setUsernameClaimUndefined: Self = StObject.set(x, "usernameClaim", js.undefined)
    
    inline def setUsernamePrefix(value: String): Self = StObject.set(x, "usernamePrefix", value.asInstanceOf[js.Any])
    
    inline def setUsernamePrefixUndefined: Self = StObject.set(x, "usernamePrefix", js.undefined)
  }
}
