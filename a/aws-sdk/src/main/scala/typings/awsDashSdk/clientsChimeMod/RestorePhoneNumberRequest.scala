package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestorePhoneNumberRequest extends js.Object {
  /**
    * The phone number.
    */
  var PhoneNumberId: NonEmptyString = js.native
}

object RestorePhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberId: NonEmptyString): RestorePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestorePhoneNumberRequest]
  }
}

