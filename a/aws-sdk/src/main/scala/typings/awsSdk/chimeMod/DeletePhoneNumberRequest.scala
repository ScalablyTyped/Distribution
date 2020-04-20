package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePhoneNumberRequest extends js.Object {
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String = js.native
}

object DeletePhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberId: String): DeletePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePhoneNumberRequest]
  }
}

