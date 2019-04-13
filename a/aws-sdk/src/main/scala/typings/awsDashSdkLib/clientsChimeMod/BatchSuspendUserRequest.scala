package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchSuspendUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The request containing the user IDs to suspend.
    */
  var UserIdList: awsDashSdkLib.clientsChimeMod.UserIdList
}

object BatchSuspendUserRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserIdList: UserIdList): BatchSuspendUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, UserIdList = UserIdList)
  
    __obj.asInstanceOf[BatchSuspendUserRequest]
  }
}

