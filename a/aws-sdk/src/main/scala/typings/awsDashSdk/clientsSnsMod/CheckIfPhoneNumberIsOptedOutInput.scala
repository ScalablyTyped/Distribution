package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIfPhoneNumberIsOptedOutInput extends js.Object {
  /**
    * The phone number for which you want to check the opt out status.
    */
  var phoneNumber: PhoneNumber
}

object CheckIfPhoneNumberIsOptedOutInput {
  @scala.inline
  def apply(phoneNumber: PhoneNumber): CheckIfPhoneNumberIsOptedOutInput = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber)
  
    __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutInput]
  }
}

