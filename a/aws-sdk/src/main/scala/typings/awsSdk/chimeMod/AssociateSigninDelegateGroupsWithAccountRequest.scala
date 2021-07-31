package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateSigninDelegateGroupsWithAccountRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The sign-in delegate groups.
    */
  var SigninDelegateGroups: SigninDelegateGroupList
}
object AssociateSigninDelegateGroupsWithAccountRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, SigninDelegateGroups: SigninDelegateGroupList): AssociateSigninDelegateGroupsWithAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], SigninDelegateGroups = SigninDelegateGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSigninDelegateGroupsWithAccountRequest]
  }
  
  @scala.inline
  implicit class AssociateSigninDelegateGroupsWithAccountRequestMutableBuilder[Self <: AssociateSigninDelegateGroupsWithAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigninDelegateGroups(value: SigninDelegateGroupList): Self = StObject.set(x, "SigninDelegateGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigninDelegateGroupsVarargs(value: SigninDelegateGroup*): Self = StObject.set(x, "SigninDelegateGroups", js.Array(value :_*))
  }
}
