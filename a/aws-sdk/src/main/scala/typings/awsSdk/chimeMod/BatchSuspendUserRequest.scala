package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchSuspendUserRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The request containing the user IDs to suspend.
    */
  var UserIdList: typings.awsSdk.chimeMod.UserIdList = js.native
}
object BatchSuspendUserRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, UserIdList: UserIdList): BatchSuspendUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserIdList = UserIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSuspendUserRequest]
  }
  
  @scala.inline
  implicit class BatchSuspendUserRequestMutableBuilder[Self <: BatchSuspendUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdList(value: UserIdList): Self = StObject.set(x, "UserIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdListVarargs(value: NonEmptyString*): Self = StObject.set(x, "UserIdList", js.Array(value :_*))
  }
}
