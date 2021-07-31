package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateSigninDelegateGroupsFromAccountRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The sign-in delegate group names.
    */
  var GroupNames: NonEmptyStringList
}
object DisassociateSigninDelegateGroupsFromAccountRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, GroupNames: NonEmptyStringList): DisassociateSigninDelegateGroupsFromAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], GroupNames = GroupNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSigninDelegateGroupsFromAccountRequest]
  }
  
  @scala.inline
  implicit class DisassociateSigninDelegateGroupsFromAccountRequestMutableBuilder[Self <: DisassociateSigninDelegateGroupsFromAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNames(value: NonEmptyStringList): Self = StObject.set(x, "GroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNamesVarargs(value: String*): Self = StObject.set(x, "GroupNames", js.Array(value :_*))
  }
}
