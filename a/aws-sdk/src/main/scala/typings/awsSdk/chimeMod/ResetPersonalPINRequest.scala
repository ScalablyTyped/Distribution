package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetPersonalPINRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The user ID.
    */
  var UserId: NonEmptyString = js.native
}

object ResetPersonalPINRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserId: NonEmptyString): ResetPersonalPINRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResetPersonalPINRequest]
  }
}

