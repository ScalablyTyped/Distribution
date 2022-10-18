package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUnsuspendUserRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The request containing the user IDs to unsuspend.
    */
  var UserIdList: typings.awsSdk.clientsChimeMod.UserIdList
}
object BatchUnsuspendUserRequest {
  
  inline def apply(AccountId: NonEmptyString, UserIdList: UserIdList): BatchUnsuspendUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserIdList = UserIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUnsuspendUserRequest]
  }
  
  extension [Self <: BatchUnsuspendUserRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setUserIdList(value: UserIdList): Self = StObject.set(x, "UserIdList", value.asInstanceOf[js.Any])
    
    inline def setUserIdListVarargs(value: NonEmptyString*): Self = StObject.set(x, "UserIdList", js.Array(value*))
  }
}
