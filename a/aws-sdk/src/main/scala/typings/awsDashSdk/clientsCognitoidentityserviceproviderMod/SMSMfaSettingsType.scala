package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSMfaSettingsType extends js.Object {
  /**
    * Specifies whether SMS text message MFA is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  /**
    * Specifies whether SMS is the preferred MFA method.
    */
  var PreferredMfa: js.UndefOr[BooleanType] = js.native
}

object SMSMfaSettingsType {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined, PreferredMfa: js.UndefOr[Boolean] = js.undefined): SMSMfaSettingsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(PreferredMfa)) __obj.updateDynamic("PreferredMfa")(PreferredMfa.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSMfaSettingsType]
  }
}

