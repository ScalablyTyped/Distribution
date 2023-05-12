package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAdminsManagingAccountResponse extends StObject {
  
  /**
    * The list of accounts who manage member accounts within their AdminScope.
    */
  var AdminAccounts: js.UndefOr[AccountIdList] = js.undefined
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAdminsManagingAccountResponse {
  
  inline def apply(): ListAdminsManagingAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAdminsManagingAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAdminsManagingAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setAdminAccounts(value: AccountIdList): Self = StObject.set(x, "AdminAccounts", value.asInstanceOf[js.Any])
    
    inline def setAdminAccountsUndefined: Self = StObject.set(x, "AdminAccounts", js.undefined)
    
    inline def setAdminAccountsVarargs(value: AWSAccountId*): Self = StObject.set(x, "AdminAccounts", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
