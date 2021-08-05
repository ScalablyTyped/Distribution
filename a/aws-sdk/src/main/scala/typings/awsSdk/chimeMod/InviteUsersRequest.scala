package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteUsersRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The user email addresses to which to send the email invitation.
    */
  var UserEmailList: typings.awsSdk.chimeMod.UserEmailList
  
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typings.awsSdk.chimeMod.UserType] = js.undefined
}
object InviteUsersRequest {
  
  inline def apply(AccountId: NonEmptyString, UserEmailList: UserEmailList): InviteUsersRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserEmailList = UserEmailList.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteUsersRequest]
  }
  
  extension [Self <: InviteUsersRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setUserEmailList(value: UserEmailList): Self = StObject.set(x, "UserEmailList", value.asInstanceOf[js.Any])
    
    inline def setUserEmailListVarargs(value: EmailAddress*): Self = StObject.set(x, "UserEmailList", js.Array(value :_*))
    
    inline def setUserType(value: UserType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    inline def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
