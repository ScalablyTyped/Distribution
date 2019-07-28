package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatePhoneNumberWithUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: typings.awsDashSdk.clientsChimeMod.E164PhoneNumber
  /**
    * The user ID.
    */
  var UserId: String
}

object AssociatePhoneNumberWithUserRequest {
  @scala.inline
  def apply(AccountId: String, E164PhoneNumber: E164PhoneNumber, UserId: String): AssociatePhoneNumberWithUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, E164PhoneNumber = E164PhoneNumber, UserId = UserId)
  
    __obj.asInstanceOf[AssociatePhoneNumberWithUserRequest]
  }
}

