package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRecoverySettingType extends js.Object {
  /**
    * The list of RecoveryOptionTypes.
    */
  var RecoveryMechanisms: js.UndefOr[RecoveryMechanismsType] = js.native
}

object AccountRecoverySettingType {
  @scala.inline
  def apply(RecoveryMechanisms: RecoveryMechanismsType = null): AccountRecoverySettingType = {
    val __obj = js.Dynamic.literal()
    if (RecoveryMechanisms != null) __obj.updateDynamic("RecoveryMechanisms")(RecoveryMechanisms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRecoverySettingType]
  }
}

