package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocialProviderSettings extends StObject {
  
  var Facebook: js.UndefOr[BackendAuthSocialProviderConfig] = js.undefined
  
  var Google: js.UndefOr[BackendAuthSocialProviderConfig] = js.undefined
  
  var LoginWithAmazon: js.UndefOr[BackendAuthSocialProviderConfig] = js.undefined
  
  var SignInWithApple: js.UndefOr[BackendAuthAppleProviderConfig] = js.undefined
}
object SocialProviderSettings {
  
  inline def apply(): SocialProviderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialProviderSettings]
  }
  
  extension [Self <: SocialProviderSettings](x: Self) {
    
    inline def setFacebook(value: BackendAuthSocialProviderConfig): Self = StObject.set(x, "Facebook", value.asInstanceOf[js.Any])
    
    inline def setFacebookUndefined: Self = StObject.set(x, "Facebook", js.undefined)
    
    inline def setGoogle(value: BackendAuthSocialProviderConfig): Self = StObject.set(x, "Google", value.asInstanceOf[js.Any])
    
    inline def setGoogleUndefined: Self = StObject.set(x, "Google", js.undefined)
    
    inline def setLoginWithAmazon(value: BackendAuthSocialProviderConfig): Self = StObject.set(x, "LoginWithAmazon", value.asInstanceOf[js.Any])
    
    inline def setLoginWithAmazonUndefined: Self = StObject.set(x, "LoginWithAmazon", js.undefined)
    
    inline def setSignInWithApple(value: BackendAuthAppleProviderConfig): Self = StObject.set(x, "SignInWithApple", value.asInstanceOf[js.Any])
    
    inline def setSignInWithAppleUndefined: Self = StObject.set(x, "SignInWithApple", js.undefined)
  }
}
