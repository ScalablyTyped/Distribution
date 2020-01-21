package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPhoneNumberRequest extends js.Object {
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String = js.native
}

object GetPhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberId: String): GetPhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPhoneNumberRequest]
  }
}

