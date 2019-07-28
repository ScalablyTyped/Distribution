package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumber extends js.Object {
  /**
    * The raw value of the phone number.
    */
  var Number: RawPhoneNumber
  /**
    * The type of the phone number.
    */
  var Type: PhoneNumberType
}

object PhoneNumber {
  @scala.inline
  def apply(Number: RawPhoneNumber, Type: PhoneNumberType): PhoneNumber = {
    val __obj = js.Dynamic.literal(Number = Number, Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhoneNumber]
  }
}

