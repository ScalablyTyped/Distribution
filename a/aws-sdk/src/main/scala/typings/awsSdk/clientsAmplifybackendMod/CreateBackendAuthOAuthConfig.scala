package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendAuthOAuthConfig extends StObject {
  
  /**
    * The domain prefix for your Amplify app.
    */
  var DomainPrefix: js.UndefOr[string] = js.undefined
  
  /**
    * The OAuth grant type that you use to allow app users to authenticate from your Amplify app.
    */
  var OAuthGrantType: typings.awsSdk.clientsAmplifybackendMod.OAuthGrantType
  
  /**
    * List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
    */
  var OAuthScopes: ListOfOAuthScopesElement
  
  /**
    * The redirected URI for signing in to your Amplify app.
    */
  var RedirectSignInURIs: ListOfString
  
  /**
    * Redirect URLs that OAuth uses when a user signs out of an Amplify app.
    */
  var RedirectSignOutURIs: ListOfString
  
  /**
    * The settings for using social providers to access your Amplify app.
    */
  var SocialProviderSettings: js.UndefOr[typings.awsSdk.clientsAmplifybackendMod.SocialProviderSettings] = js.undefined
}
object CreateBackendAuthOAuthConfig {
  
  inline def apply(
    OAuthGrantType: OAuthGrantType,
    OAuthScopes: ListOfOAuthScopesElement,
    RedirectSignInURIs: ListOfString,
    RedirectSignOutURIs: ListOfString
  ): CreateBackendAuthOAuthConfig = {
    val __obj = js.Dynamic.literal(OAuthGrantType = OAuthGrantType.asInstanceOf[js.Any], OAuthScopes = OAuthScopes.asInstanceOf[js.Any], RedirectSignInURIs = RedirectSignInURIs.asInstanceOf[js.Any], RedirectSignOutURIs = RedirectSignOutURIs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendAuthOAuthConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBackendAuthOAuthConfig] (val x: Self) extends AnyVal {
    
    inline def setDomainPrefix(value: string): Self = StObject.set(x, "DomainPrefix", value.asInstanceOf[js.Any])
    
    inline def setDomainPrefixUndefined: Self = StObject.set(x, "DomainPrefix", js.undefined)
    
    inline def setOAuthGrantType(value: OAuthGrantType): Self = StObject.set(x, "OAuthGrantType", value.asInstanceOf[js.Any])
    
    inline def setOAuthScopes(value: ListOfOAuthScopesElement): Self = StObject.set(x, "OAuthScopes", value.asInstanceOf[js.Any])
    
    inline def setOAuthScopesVarargs(value: OAuthScopesElement*): Self = StObject.set(x, "OAuthScopes", js.Array(value*))
    
    inline def setRedirectSignInURIs(value: ListOfString): Self = StObject.set(x, "RedirectSignInURIs", value.asInstanceOf[js.Any])
    
    inline def setRedirectSignInURIsVarargs(value: string*): Self = StObject.set(x, "RedirectSignInURIs", js.Array(value*))
    
    inline def setRedirectSignOutURIs(value: ListOfString): Self = StObject.set(x, "RedirectSignOutURIs", value.asInstanceOf[js.Any])
    
    inline def setRedirectSignOutURIsVarargs(value: string*): Self = StObject.set(x, "RedirectSignOutURIs", js.Array(value*))
    
    inline def setSocialProviderSettings(value: SocialProviderSettings): Self = StObject.set(x, "SocialProviderSettings", value.asInstanceOf[js.Any])
    
    inline def setSocialProviderSettingsUndefined: Self = StObject.set(x, "SocialProviderSettings", js.undefined)
  }
}
