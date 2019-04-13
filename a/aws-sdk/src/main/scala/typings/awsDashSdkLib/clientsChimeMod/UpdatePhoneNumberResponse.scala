package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePhoneNumberResponse extends js.Object {
  /**
    * The updated phone number details.
    */
  var PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
}

object UpdatePhoneNumberResponse {
  @scala.inline
  def apply(PhoneNumber: PhoneNumber = null): UpdatePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber)
    __obj.asInstanceOf[UpdatePhoneNumberResponse]
  }
}

