package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPersonalPINRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The user ID.
    */
  var UserId: NonEmptyString
}

object ResetPersonalPINRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserId: NonEmptyString): ResetPersonalPINRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, UserId = UserId)
  
    __obj.asInstanceOf[ResetPersonalPINRequest]
  }
}

