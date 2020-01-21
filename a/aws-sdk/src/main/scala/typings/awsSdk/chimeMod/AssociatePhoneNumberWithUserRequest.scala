package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatePhoneNumberWithUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String = js.native
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: typings.awsSdk.chimeMod.E164PhoneNumber = js.native
  /**
    * The user ID.
    */
  var UserId: String = js.native
}

object AssociatePhoneNumberWithUserRequest {
  @scala.inline
  def apply(AccountId: String, E164PhoneNumber: E164PhoneNumber, UserId: String): AssociatePhoneNumberWithUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], E164PhoneNumber = E164PhoneNumber.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociatePhoneNumberWithUserRequest]
  }
}

