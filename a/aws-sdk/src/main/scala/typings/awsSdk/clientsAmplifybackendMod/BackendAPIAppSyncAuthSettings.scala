package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendAPIAppSyncAuthSettings extends StObject {
  
  /**
    * The Amazon Cognito user pool ID, if Amazon Cognito was used as an authentication setting to access your data models.
    */
  var CognitoUserPoolId: js.UndefOr[string] = js.undefined
  
  /**
    * The API key description for API_KEY, if it was used as an authentication mechanism to access your data models.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The API key expiration time for API_KEY, if it was used as an authentication mechanism to access your data models.
    */
  var ExpirationTime: js.UndefOr[double] = js.undefined
  
  /**
    * The expiry time for the OpenID authentication mechanism.
    */
  var OpenIDAuthTTL: js.UndefOr[string] = js.undefined
  
  /**
    * The clientID for openID, if openID was used as an authentication setting to access your data models.
    */
  var OpenIDClientId: js.UndefOr[string] = js.undefined
  
  /**
    * The expiry time for the OpenID authentication mechanism.
    */
  var OpenIDIatTTL: js.UndefOr[string] = js.undefined
  
  /**
    * The openID issuer URL, if openID was used as an authentication setting to access your data models.
    */
  var OpenIDIssueURL: js.UndefOr[string] = js.undefined
  
  /**
    * The OpenID provider name, if OpenID was used as an authentication mechanism to access your data models.
    */
  var OpenIDProviderName: js.UndefOr[string] = js.undefined
}
object BackendAPIAppSyncAuthSettings {
  
  inline def apply(): BackendAPIAppSyncAuthSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendAPIAppSyncAuthSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackendAPIAppSyncAuthSettings] (val x: Self) extends AnyVal {
    
    inline def setCognitoUserPoolId(value: string): Self = StObject.set(x, "CognitoUserPoolId", value.asInstanceOf[js.Any])
    
    inline def setCognitoUserPoolIdUndefined: Self = StObject.set(x, "CognitoUserPoolId", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpirationTime(value: double): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    inline def setOpenIDAuthTTL(value: string): Self = StObject.set(x, "OpenIDAuthTTL", value.asInstanceOf[js.Any])
    
    inline def setOpenIDAuthTTLUndefined: Self = StObject.set(x, "OpenIDAuthTTL", js.undefined)
    
    inline def setOpenIDClientId(value: string): Self = StObject.set(x, "OpenIDClientId", value.asInstanceOf[js.Any])
    
    inline def setOpenIDClientIdUndefined: Self = StObject.set(x, "OpenIDClientId", js.undefined)
    
    inline def setOpenIDIatTTL(value: string): Self = StObject.set(x, "OpenIDIatTTL", value.asInstanceOf[js.Any])
    
    inline def setOpenIDIatTTLUndefined: Self = StObject.set(x, "OpenIDIatTTL", js.undefined)
    
    inline def setOpenIDIssueURL(value: string): Self = StObject.set(x, "OpenIDIssueURL", value.asInstanceOf[js.Any])
    
    inline def setOpenIDIssueURLUndefined: Self = StObject.set(x, "OpenIDIssueURL", js.undefined)
    
    inline def setOpenIDProviderName(value: string): Self = StObject.set(x, "OpenIDProviderName", value.asInstanceOf[js.Any])
    
    inline def setOpenIDProviderNameUndefined: Self = StObject.set(x, "OpenIDProviderName", js.undefined)
  }
}
