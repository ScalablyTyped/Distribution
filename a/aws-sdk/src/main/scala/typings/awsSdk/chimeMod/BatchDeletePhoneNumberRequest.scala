package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeletePhoneNumberRequest extends js.Object {
  /**
    * List of phone number IDs.
    */
  var PhoneNumberIds: NonEmptyStringList = js.native
}

object BatchDeletePhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberIds: NonEmptyStringList): BatchDeletePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberIds = PhoneNumberIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeletePhoneNumberRequest]
  }
}

