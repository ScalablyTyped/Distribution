package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUnsuspendUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The request containing the user IDs to unsuspend.
    */
  var UserIdList: typings.awsDashSdk.clientsChimeMod.UserIdList = js.native
}

object BatchUnsuspendUserRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserIdList: UserIdList): BatchUnsuspendUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserIdList = UserIdList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchUnsuspendUserRequest]
  }
}

