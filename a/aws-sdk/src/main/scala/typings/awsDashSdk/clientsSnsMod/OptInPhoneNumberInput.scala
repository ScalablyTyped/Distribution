package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptInPhoneNumberInput extends js.Object {
  /**
    * The phone number to opt in.
    */
  var phoneNumber: PhoneNumber
}

object OptInPhoneNumberInput {
  @scala.inline
  def apply(phoneNumber: PhoneNumber): OptInPhoneNumberInput = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber)
  
    __obj.asInstanceOf[OptInPhoneNumberInput]
  }
}

