package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogoutUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The user ID.
    */
  var UserId: NonEmptyString
}

object LogoutUserRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserId: NonEmptyString): LogoutUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, UserId = UserId)
  
    __obj.asInstanceOf[LogoutUserRequest]
  }
}

