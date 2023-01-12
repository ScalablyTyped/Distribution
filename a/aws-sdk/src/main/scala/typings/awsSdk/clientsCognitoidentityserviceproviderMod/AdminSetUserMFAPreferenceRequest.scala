package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminSetUserMFAPreferenceRequest extends StObject {
  
  /**
    * The SMS text message MFA settings.
    */
  var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.undefined
  
  /**
    * The time-based one-time password software token MFA settings.
    */
  var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.undefined
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user pool username or alias.
    */
  var Username: UsernameType
}
object AdminSetUserMFAPreferenceRequest {
  
  inline def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminSetUserMFAPreferenceRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminSetUserMFAPreferenceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminSetUserMFAPreferenceRequest] (val x: Self) extends AnyVal {
    
    inline def setSMSMfaSettings(value: SMSMfaSettingsType): Self = StObject.set(x, "SMSMfaSettings", value.asInstanceOf[js.Any])
    
    inline def setSMSMfaSettingsUndefined: Self = StObject.set(x, "SMSMfaSettings", js.undefined)
    
    inline def setSoftwareTokenMfaSettings(value: SoftwareTokenMfaSettingsType): Self = StObject.set(x, "SoftwareTokenMfaSettings", value.asInstanceOf[js.Any])
    
    inline def setSoftwareTokenMfaSettingsUndefined: Self = StObject.set(x, "SoftwareTokenMfaSettings", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
