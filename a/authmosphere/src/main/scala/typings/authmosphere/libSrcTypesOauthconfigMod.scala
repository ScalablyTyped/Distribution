package typings.authmosphere

import org.scalablytyped.runtime.StringDictionary
import typings.authmosphere.anon.Code
import typings.authmosphere.anon.RefreshToken
import typings.authmosphere.anon.TokenInfoEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTypesOauthconfigMod {
  
  type AuthorizationCodeGrantConfig = CredentialsConfig & GrantConfigBase & Code
  
  type ClientCredentialsGrantConfig = CredentialsConfig & GrantConfigBase
  
  trait CredentialsClientConfig
    extends StObject
       with CredentialsConfig {
    
    var clientId: String
    
    var clientSecret: String
  }
  object CredentialsClientConfig {
    
    inline def apply(clientId: String, clientSecret: String): CredentialsClientConfig = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialsClientConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CredentialsClientConfig] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsDirConfig
    - typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsClientConfig
  */
  trait CredentialsConfig extends StObject
  object CredentialsConfig {
    
    inline def CredentialsClientConfig(clientId: String, clientSecret: String): typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsClientConfig = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsClientConfig]
    }
    
    inline def CredentialsDirConfig(credentialsDir: String): typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsDirConfig = {
      val __obj = js.Dynamic.literal(credentialsDir = credentialsDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsDirConfig]
    }
  }
  
  trait CredentialsDirConfig
    extends StObject
       with CredentialsConfig
       with CredentialsPasswordConfig {
    
    var credentialsDir: String
  }
  object CredentialsDirConfig {
    
    inline def apply(credentialsDir: String): CredentialsDirConfig = {
      val __obj = js.Dynamic.literal(credentialsDir = credentialsDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialsDirConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CredentialsDirConfig] (val x: Self) extends AnyVal {
      
      inline def setCredentialsDir(value: String): Self = StObject.set(x, "credentialsDir", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsDirConfig
    - typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsUserClientConfig
  */
  trait CredentialsPasswordConfig extends StObject
  object CredentialsPasswordConfig {
    
    inline def CredentialsDirConfig(credentialsDir: String): typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsDirConfig = {
      val __obj = js.Dynamic.literal(credentialsDir = credentialsDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsDirConfig]
    }
    
    inline def CredentialsUserClientConfig(applicationPassword: String, applicationUsername: String, clientId: String, clientSecret: String): typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsUserClientConfig = {
      val __obj = js.Dynamic.literal(applicationPassword = applicationPassword.asInstanceOf[js.Any], applicationUsername = applicationUsername.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.authmosphere.libSrcTypesOauthconfigMod.CredentialsUserClientConfig]
    }
  }
  
  trait CredentialsUserClientConfig
    extends StObject
       with CredentialsClientConfig
       with CredentialsUserConfig
       with CredentialsPasswordConfig
  object CredentialsUserClientConfig {
    
    inline def apply(applicationPassword: String, applicationUsername: String, clientId: String, clientSecret: String): CredentialsUserClientConfig = {
      val __obj = js.Dynamic.literal(applicationPassword = applicationPassword.asInstanceOf[js.Any], applicationUsername = applicationUsername.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialsUserClientConfig]
    }
  }
  
  trait CredentialsUserConfig extends StObject {
    
    var applicationPassword: String
    
    var applicationUsername: String
  }
  object CredentialsUserConfig {
    
    inline def apply(applicationPassword: String, applicationUsername: String): CredentialsUserConfig = {
      val __obj = js.Dynamic.literal(applicationPassword = applicationPassword.asInstanceOf[js.Any], applicationUsername = applicationUsername.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialsUserConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CredentialsUserConfig] (val x: Self) extends AnyVal {
      
      inline def setApplicationPassword(value: String): Self = StObject.set(x, "applicationPassword", value.asInstanceOf[js.Any])
      
      inline def setApplicationUsername(value: String): Self = StObject.set(x, "applicationUsername", value.asInstanceOf[js.Any])
    }
  }
  
  trait GrantConfigBase extends StObject {
    
    var accessTokenEndpoint: String
    
    var bodyParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var grantType: String
    
    var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GrantConfigBase {
    
    inline def apply(accessTokenEndpoint: String, grantType: String): GrantConfigBase = {
      val __obj = js.Dynamic.literal(accessTokenEndpoint = accessTokenEndpoint.asInstanceOf[js.Any], grantType = grantType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrantConfigBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrantConfigBase] (val x: Self) extends AnyVal {
      
      inline def setAccessTokenEndpoint(value: String): Self = StObject.set(x, "accessTokenEndpoint", value.asInstanceOf[js.Any])
      
      inline def setBodyParams(value: StringDictionary[String]): Self = StObject.set(x, "bodyParams", value.asInstanceOf[js.Any])
      
      inline def setBodyParamsUndefined: Self = StObject.set(x, "bodyParams", js.undefined)
      
      inline def setGrantType(value: String): Self = StObject.set(x, "grantType", value.asInstanceOf[js.Any])
      
      inline def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  type OAuthConfig = ClientCredentialsGrantConfig | AuthorizationCodeGrantConfig | PasswordCredentialsGrantConfig | RefreshGrantConfig
  
  type PasswordCredentialsGrantConfig = CredentialsPasswordConfig & GrantConfigBase
  
  type RefreshGrantConfig = CredentialsConfig & GrantConfigBase & RefreshToken
  
  type TokenCacheOAuthConfig = (ClientCredentialsGrantConfig & TokenInfoEndpoint) | (PasswordCredentialsGrantConfig & TokenInfoEndpoint)
}
