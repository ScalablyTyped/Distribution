package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUnsuspendUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The request containing the user IDs to unsuspend.
    */
  var UserIdList: typings.awsDashSdk.clientsChimeMod.UserIdList
}

object BatchUnsuspendUserRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserIdList: UserIdList): BatchUnsuspendUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, UserIdList = UserIdList)
  
    __obj.asInstanceOf[BatchUnsuspendUserRequest]
  }
}

