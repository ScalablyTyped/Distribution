package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminSetUserMFAPreferenceRequest extends js.Object {
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
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    SMSMfaSettings: SMSMfaSettingsType = null,
    SoftwareTokenMfaSettings: SoftwareTokenMfaSettingsType = null
  ): AdminSetUserMFAPreferenceRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId, Username = Username)
    if (SMSMfaSettings != null) __obj.updateDynamic("SMSMfaSettings")(SMSMfaSettings)
    if (SoftwareTokenMfaSettings != null) __obj.updateDynamic("SoftwareTokenMfaSettings")(SoftwareTokenMfaSettings)
    __obj.asInstanceOf[AdminSetUserMFAPreferenceRequest]
  }
}

