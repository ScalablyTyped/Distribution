package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociatePhoneNumberFromUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String = js.native
  /**
    * The user ID.
    */
  var UserId: String = js.native
}

object DisassociatePhoneNumberFromUserRequest {
  @scala.inline
  def apply(AccountId: String, UserId: String): DisassociatePhoneNumberFromUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociatePhoneNumberFromUserRequest]
  }
}

