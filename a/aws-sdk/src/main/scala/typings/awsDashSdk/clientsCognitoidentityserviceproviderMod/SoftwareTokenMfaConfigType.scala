package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftwareTokenMfaConfigType extends js.Object {
  /**
    * Specifies whether software token MFA is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.undefined
}

object SoftwareTokenMfaConfigType {
  @scala.inline
  def apply(Enabled: js.UndefOr[BooleanType] = js.undefined): SoftwareTokenMfaConfigType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[SoftwareTokenMfaConfigType]
  }
}

