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
  @scala.inline
  implicit class PhoneNumberOps[Self <: PhoneNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNumber(value: RawPhoneNumber): Self = this.set("Number", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PhoneNumberType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

