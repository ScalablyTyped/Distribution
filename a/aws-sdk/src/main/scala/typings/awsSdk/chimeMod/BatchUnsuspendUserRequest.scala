package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUnsuspendUserRequest extends StObject {
  
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
  implicit class BatchUnsuspendUserRequestMutableBuilder[Self <: BatchUnsuspendUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdList(value: UserIdList): Self = StObject.set(x, "UserIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdListVarargs(value: NonEmptyString*): Self = StObject.set(x, "UserIdList", js.Array(value :_*))
  }
}
