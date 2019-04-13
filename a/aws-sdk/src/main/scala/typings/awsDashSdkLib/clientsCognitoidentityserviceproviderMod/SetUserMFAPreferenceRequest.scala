package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetUserMFAPreferenceRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType
  /**
    * The SMS text message multi-factor authentication (MFA) settings.
    */
  var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.undefined
  /**
    * The time-based one-time password software token MFA settings.
    */
  var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.undefined
}

object SetUserMFAPreferenceRequest {
  @scala.inline
  def apply(
    AccessToken: TokenModelType,
    SMSMfaSettings: SMSMfaSettingsType = null,
    SoftwareTokenMfaSettings: SoftwareTokenMfaSettingsType = null
  ): SetUserMFAPreferenceRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken)
    if (SMSMfaSettings != null) __obj.updateDynamic("SMSMfaSettings")(SMSMfaSettings)
    if (SoftwareTokenMfaSettings != null) __obj.updateDynamic("SoftwareTokenMfaSettings")(SoftwareTokenMfaSettings)
    __obj.asInstanceOf[SetUserMFAPreferenceRequest]
  }
}

