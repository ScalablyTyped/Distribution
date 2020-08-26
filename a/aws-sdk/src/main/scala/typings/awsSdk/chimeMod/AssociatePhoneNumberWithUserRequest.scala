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
  @scala.inline
  implicit class AssociatePhoneNumberWithUserRequestOps[Self <: AssociatePhoneNumberWithUserRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setE164PhoneNumber(value: E164PhoneNumber): Self = this.set("E164PhoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
  
}

