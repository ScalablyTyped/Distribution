package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumber extends js.Object {
  /**
    * The raw value of the phone number.
    */
  var Number: RawPhoneNumber = js.native
  /**
    * The type of the phone number.
    */
  var Type: PhoneNumberType = js.native
}

object PhoneNumber {
  @scala.inline
  def apply(Number: RawPhoneNumber, Type: PhoneNumberType): PhoneNumber = {
    val __obj = js.Dynamic.literal(Number = Number.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhoneNumber]
  }
}

