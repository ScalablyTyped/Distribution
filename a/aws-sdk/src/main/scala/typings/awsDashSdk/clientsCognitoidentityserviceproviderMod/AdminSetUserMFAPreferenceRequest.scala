package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminSetUserMFAPreferenceRequest extends js.Object {
  /**
    * The SMS text message MFA settings.
    */
  var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.native
  /**
    * The time-based one-time password software token MFA settings.
    */
  var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user pool username or alias.
    */
  var Username: UsernameType = js.native
}

object AdminSetUserMFAPreferenceRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    SMSMfaSettings: SMSMfaSettingsType = null,
    SoftwareTokenMfaSettings: SoftwareTokenMfaSettingsType = null
  ): AdminSetUserMFAPreferenceRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    if (SMSMfaSettings != null) __obj.updateDynamic("SMSMfaSettings")(SMSMfaSettings.asInstanceOf[js.Any])
    if (SoftwareTokenMfaSettings != null) __obj.updateDynamic("SoftwareTokenMfaSettings")(SoftwareTokenMfaSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminSetUserMFAPreferenceRequest]
  }
}

