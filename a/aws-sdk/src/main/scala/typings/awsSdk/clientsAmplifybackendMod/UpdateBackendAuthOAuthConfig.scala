package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendAuthOAuthConfig extends StObject {
  
  /**
    * The Amazon Cognito domain prefix used to create a hosted UI for authentication.
    */
  var DomainPrefix: js.UndefOr[string] = js.undefined
  
  /**
    * The OAuth grant type to allow app users to authenticate from your Amplify app.
    */
  var OAuthGrantType: js.UndefOr[typings.awsSdk.clientsAmplifybackendMod.OAuthGrantType] = js.undefined
  
  /**
    * The list of OAuth-related flows that can allow users to authenticate from your Amplify app.
    */
  var OAuthScopes: js.UndefOr[ListOfOAuthScopesElement] = js.undefined
  
  /**
    * Redirect URLs that OAuth uses when a user signs in to an Amplify app.
    */
  var RedirectSignInURIs: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * Redirect URLs that OAuth uses when a user signs out of an Amplify app.
    */
  var RedirectSignOutURIs: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * Describes third-party social federation configurations for allowing your users to sign in with OAuth.
    */
  var SocialProviderSettings: js.UndefOr[typings.awsSdk.clientsAmplifybackendMod.SocialProviderSettings] = js.undefined
}
object UpdateBackendAuthOAuthConfig {
  
  inline def apply(): UpdateBackendAuthOAuthConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBackendAuthOAuthConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBackendAuthOAuthConfig] (val x: Self) extends AnyVal {
    
    inline def setDomainPrefix(value: string): Self = StObject.set(x, "DomainPrefix", value.asInstanceOf[js.Any])
    
    inline def setDomainPrefixUndefined: Self = StObject.set(x, "DomainPrefix", js.undefined)
    
    inline def setOAuthGrantType(value: OAuthGrantType): Self = StObject.set(x, "OAuthGrantType", value.asInstanceOf[js.Any])
    
    inline def setOAuthGrantTypeUndefined: Self = StObject.set(x, "OAuthGrantType", js.undefined)
    
    inline def setOAuthScopes(value: ListOfOAuthScopesElement): Self = StObject.set(x, "OAuthScopes", value.asInstanceOf[js.Any])
    
    inline def setOAuthScopesUndefined: Self = StObject.set(x, "OAuthScopes", js.undefined)
    
    inline def setOAuthScopesVarargs(value: OAuthScopesElement*): Self = StObject.set(x, "OAuthScopes", js.Array(value*))
    
    inline def setRedirectSignInURIs(value: ListOfString): Self = StObject.set(x, "RedirectSignInURIs", value.asInstanceOf[js.Any])
    
    inline def setRedirectSignInURIsUndefined: Self = StObject.set(x, "RedirectSignInURIs", js.undefined)
    
    inline def setRedirectSignInURIsVarargs(value: string*): Self = StObject.set(x, "RedirectSignInURIs", js.Array(value*))
    
    inline def setRedirectSignOutURIs(value: ListOfString): Self = StObject.set(x, "RedirectSignOutURIs", value.asInstanceOf[js.Any])
    
    inline def setRedirectSignOutURIsUndefined: Self = StObject.set(x, "RedirectSignOutURIs", js.undefined)
    
    inline def setRedirectSignOutURIsVarargs(value: string*): Self = StObject.set(x, "RedirectSignOutURIs", js.Array(value*))
    
    inline def setSocialProviderSettings(value: SocialProviderSettings): Self = StObject.set(x, "SocialProviderSettings", value.asInstanceOf[js.Any])
    
    inline def setSocialProviderSettingsUndefined: Self = StObject.set(x, "SocialProviderSettings", js.undefined)
  }
}
