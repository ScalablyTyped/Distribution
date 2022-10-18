package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUserMFAPreferenceRequest extends StObject {
  
  /**
    * A valid access token that Amazon Cognito issued to the user whose MFA preference you want to set.
    */
  var AccessToken: TokenModelType
  
  /**
    * The SMS text message multi-factor authentication (MFA) settings.
    */
  var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.undefined
  
  /**
    * The time-based one-time password (TOTP) software token MFA settings.
    */
  var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.undefined
}
object SetUserMFAPreferenceRequest {
  
  inline def apply(AccessToken: TokenModelType): SetUserMFAPreferenceRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserMFAPreferenceRequest]
  }
  
  extension [Self <: SetUserMFAPreferenceRequest](x: Self) {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setSMSMfaSettings(value: SMSMfaSettingsType): Self = StObject.set(x, "SMSMfaSettings", value.asInstanceOf[js.Any])
    
    inline def setSMSMfaSettingsUndefined: Self = StObject.set(x, "SMSMfaSettings", js.undefined)
    
    inline def setSoftwareTokenMfaSettings(value: SoftwareTokenMfaSettingsType): Self = StObject.set(x, "SoftwareTokenMfaSettings", value.asInstanceOf[js.Any])
    
    inline def setSoftwareTokenMfaSettingsUndefined: Self = StObject.set(x, "SoftwareTokenMfaSettings", js.undefined)
  }
}
