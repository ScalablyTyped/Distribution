package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderedPhoneNumber extends js.Object {
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: js.UndefOr[typings.awsSdk.chimeMod.E164PhoneNumber] = js.native
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[OrderedPhoneNumberStatus] = js.native
}

object OrderedPhoneNumber {
  @scala.inline
  def apply(E164PhoneNumber: E164PhoneNumber = null, Status: OrderedPhoneNumberStatus = null): OrderedPhoneNumber = {
    val __obj = js.Dynamic.literal()
    if (E164PhoneNumber != null) __obj.updateDynamic("E164PhoneNumber")(E164PhoneNumber.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedPhoneNumber]
  }
}

