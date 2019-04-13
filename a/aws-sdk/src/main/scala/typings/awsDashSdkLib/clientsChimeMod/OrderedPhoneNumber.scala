package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderedPhoneNumber extends js.Object {
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[OrderedPhoneNumberStatus] = js.undefined
}

object OrderedPhoneNumber {
  @scala.inline
  def apply(E164PhoneNumber: E164PhoneNumber = null, Status: OrderedPhoneNumberStatus = null): OrderedPhoneNumber = {
    val __obj = js.Dynamic.literal()
    if (E164PhoneNumber != null) __obj.updateDynamic("E164PhoneNumber")(E164PhoneNumber)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedPhoneNumber]
  }
}

