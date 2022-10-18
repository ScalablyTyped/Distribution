package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMembersRequest extends StObject {
  
  /**
    * The account IDs of the member accounts to disassociate from the administrator account.
    */
  var AccountIds: AccountIdList
}
object DisassociateMembersRequest {
  
  inline def apply(AccountIds: AccountIdList): DisassociateMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMembersRequest]
  }
  
  extension [Self <: DisassociateMembersRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value*))
  }
}
