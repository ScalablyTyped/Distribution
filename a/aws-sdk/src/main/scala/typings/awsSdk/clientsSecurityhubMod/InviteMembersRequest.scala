package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteMembersRequest extends StObject {
  
  /**
    * The list of account IDs of the Amazon Web Services accounts to invite to Security Hub as members. 
    */
  var AccountIds: AccountIdList
}
object InviteMembersRequest {
  
  inline def apply(AccountIds: AccountIdList): InviteMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteMembersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InviteMembersRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value*))
  }
}
