package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetUserPoolMfaConfigResponse extends js.Object {
  /**
    * The MFA configuration.
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
  /**
    * The SMS text message MFA configuration.
    */
  var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined
  /**
    * The software token MFA configuration.
    */
  var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined
}

object SetUserPoolMfaConfigResponse {
  @scala.inline
  def apply(
    MfaConfiguration: UserPoolMfaType = null,
    SmsMfaConfiguration: SmsMfaConfigType = null,
    SoftwareTokenMfaConfiguration: SoftwareTokenMfaConfigType = null
  ): SetUserPoolMfaConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (MfaConfiguration != null) __obj.updateDynamic("MfaConfiguration")(MfaConfiguration.asInstanceOf[js.Any])
    if (SmsMfaConfiguration != null) __obj.updateDynamic("SmsMfaConfiguration")(SmsMfaConfiguration)
    if (SoftwareTokenMfaConfiguration != null) __obj.updateDynamic("SoftwareTokenMfaConfiguration")(SoftwareTokenMfaConfiguration)
    __obj.asInstanceOf[SetUserPoolMfaConfigResponse]
  }
}

