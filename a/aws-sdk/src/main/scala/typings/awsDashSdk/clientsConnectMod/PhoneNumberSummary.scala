package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the phone number.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the phone number.
    */
  var Id: js.UndefOr[PhoneNumberId] = js.native
  /**
    * The phone number.
    */
  var PhoneNumber: js.UndefOr[typings.awsDashSdk.clientsConnectMod.PhoneNumber] = js.native
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCode: js.UndefOr[typings.awsDashSdk.clientsConnectMod.PhoneNumberCountryCode] = js.native
  /**
    * The type of phone number.
    */
  var PhoneNumberType: js.UndefOr[typings.awsDashSdk.clientsConnectMod.PhoneNumberType] = js.native
}

object PhoneNumberSummary {
  @scala.inline
  def apply(
    Arn: ARN = null,
    Id: PhoneNumberId = null,
    PhoneNumber: PhoneNumber = null,
    PhoneNumberCountryCode: PhoneNumberCountryCode = null,
    PhoneNumberType: PhoneNumberType = null
  ): PhoneNumberSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    if (PhoneNumberCountryCode != null) __obj.updateDynamic("PhoneNumberCountryCode")(PhoneNumberCountryCode.asInstanceOf[js.Any])
    if (PhoneNumberType != null) __obj.updateDynamic("PhoneNumberType")(PhoneNumberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberSummary]
  }
}

