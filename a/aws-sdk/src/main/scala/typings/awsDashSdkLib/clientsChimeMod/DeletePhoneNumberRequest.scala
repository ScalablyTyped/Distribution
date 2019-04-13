package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePhoneNumberRequest extends js.Object {
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String
}

object DeletePhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberId: String): DeletePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId)
  
    __obj.asInstanceOf[DeletePhoneNumberRequest]
  }
}

