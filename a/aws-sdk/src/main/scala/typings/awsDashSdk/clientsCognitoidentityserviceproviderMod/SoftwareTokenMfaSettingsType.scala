package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftwareTokenMfaSettingsType extends js.Object {
  /**
    * Specifies whether software token MFA is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  /**
    * Specifies whether software token MFA is the preferred MFA method.
    */
  var PreferredMfa: js.UndefOr[BooleanType] = js.native
}

object SoftwareTokenMfaSettingsType {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined, PreferredMfa: js.UndefOr[Boolean] = js.undefined): SoftwareTokenMfaSettingsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(PreferredMfa)) __obj.updateDynamic("PreferredMfa")(PreferredMfa.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftwareTokenMfaSettingsType]
  }
}

