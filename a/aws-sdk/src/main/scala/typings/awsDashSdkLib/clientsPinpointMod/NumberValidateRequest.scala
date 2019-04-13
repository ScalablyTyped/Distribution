package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberValidateRequest extends js.Object {
  /**
    * (Optional) The two-character ISO country code for the country or region where the phone number was originally registered.
    */
  var IsoCountryCode: js.UndefOr[__string] = js.undefined
  /**
    * The phone number to get information about. The phone number that you provide should include a country code. If the number doesn't include a valid country code, the operation might result in an error.
    */
  var PhoneNumber: js.UndefOr[__string] = js.undefined
}

object NumberValidateRequest {
  @scala.inline
  def apply(IsoCountryCode: __string = null, PhoneNumber: __string = null): NumberValidateRequest = {
    val __obj = js.Dynamic.literal()
    if (IsoCountryCode != null) __obj.updateDynamic("IsoCountryCode")(IsoCountryCode)
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber)
    __obj.asInstanceOf[NumberValidateRequest]
  }
}

