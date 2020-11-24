package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUnsuspendUserRequest extends js.Object {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The request containing the user IDs to unsuspend.
    */
  var UserIdList: typings.awsSdk.chimeMod.UserIdList = js.native
}
object BatchUnsuspendUserRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, UserIdList: UserIdList): BatchUnsuspendUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserIdList = UserIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUnsuspendUserRequest]
  }
  
  @scala.inline
  implicit class BatchUnsuspendUserRequestOps[Self <: BatchUnsuspendUserRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdListVarargs(value: NonEmptyString*): Self = this.set("UserIdList", js.Array(value :_*))
    
    @scala.inline
    def setUserIdList(value: UserIdList): Self = this.set("UserIdList", value.asInstanceOf[js.Any])
  }
}
