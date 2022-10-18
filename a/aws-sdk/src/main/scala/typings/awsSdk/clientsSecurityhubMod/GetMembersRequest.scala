package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMembersRequest extends StObject {
  
  /**
    * The list of account IDs for the Security Hub member accounts to return the details for. 
    */
  var AccountIds: AccountIdList
}
object GetMembersRequest {
  
  inline def apply(AccountIds: AccountIdList): GetMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersRequest]
  }
  
  extension [Self <: GetMembersRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value*))
  }
}
