package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestorePhoneNumberRequest extends js.Object {
  /**
    * The phone number.
    */
  var PhoneNumberId: NonEmptyString
}

object RestorePhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberId: NonEmptyString): RestorePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId)
  
    __obj.asInstanceOf[RestorePhoneNumberRequest]
  }
}

