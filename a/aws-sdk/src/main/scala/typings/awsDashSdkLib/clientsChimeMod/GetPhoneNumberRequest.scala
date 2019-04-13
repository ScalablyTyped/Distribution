package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPhoneNumberRequest extends js.Object {
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String
}

object GetPhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberId: String): GetPhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId)
  
    __obj.asInstanceOf[GetPhoneNumberRequest]
  }
}

