package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPhoneConfig extends js.Object {
  /**
    * The After Call Work (ACW) timeout setting, in seconds, for the user.
    */
  var AfterContactWorkTimeLimit: js.UndefOr[typings.awsDashSdk.clientsConnectMod.AfterContactWorkTimeLimit] = js.undefined
  /**
    * The Auto accept setting for the user, Yes or No.
    */
  var AutoAccept: js.UndefOr[typings.awsDashSdk.clientsConnectMod.AutoAccept] = js.undefined
  /**
    * The phone number for the user's desk phone.
    */
  var DeskPhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
  /**
    * The phone type selected for the user, either Soft phone or Desk phone.
    */
  var PhoneType: typings.awsDashSdk.clientsConnectMod.PhoneType
}

object UserPhoneConfig {
  @scala.inline
  def apply(
    PhoneType: PhoneType,
    AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit] = js.undefined,
    AutoAccept: js.UndefOr[AutoAccept] = js.undefined,
    DeskPhoneNumber: PhoneNumber = null
  ): UserPhoneConfig = {
    val __obj = js.Dynamic.literal(PhoneType = PhoneType.asInstanceOf[js.Any])
    if (!js.isUndefined(AfterContactWorkTimeLimit)) __obj.updateDynamic("AfterContactWorkTimeLimit")(AfterContactWorkTimeLimit)
    if (!js.isUndefined(AutoAccept)) __obj.updateDynamic("AutoAccept")(AutoAccept)
    if (DeskPhoneNumber != null) __obj.updateDynamic("DeskPhoneNumber")(DeskPhoneNumber)
    __obj.asInstanceOf[UserPhoneConfig]
  }
}

