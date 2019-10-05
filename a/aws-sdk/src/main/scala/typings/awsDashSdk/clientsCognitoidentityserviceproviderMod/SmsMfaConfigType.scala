package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsMfaConfigType extends js.Object {
  /**
    * The SMS authentication message that will be sent to users with the code they need to sign in. The message must contain the ‘{####}’ placeholder, which will be replaced with the code. If the message is not included, and default message will be used.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  /**
    * The SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
}

object SmsMfaConfigType {
  @scala.inline
  def apply(
    SmsAuthenticationMessage: SmsVerificationMessageType = null,
    SmsConfiguration: SmsConfigurationType = null
  ): SmsMfaConfigType = {
    val __obj = js.Dynamic.literal()
    if (SmsAuthenticationMessage != null) __obj.updateDynamic("SmsAuthenticationMessage")(SmsAuthenticationMessage)
    if (SmsConfiguration != null) __obj.updateDynamic("SmsConfiguration")(SmsConfiguration)
    __obj.asInstanceOf[SmsMfaConfigType]
  }
}

