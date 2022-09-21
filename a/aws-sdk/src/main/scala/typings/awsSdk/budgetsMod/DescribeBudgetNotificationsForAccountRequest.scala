package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetNotificationsForAccountRequest extends StObject {
  
  var AccountId: typings.awsSdk.budgetsMod.AccountId
  
  /**
    *  An integer that shows how many budget name entries a paginated response contains. 
    */
  var MaxResults: js.UndefOr[MaxResultsBudgetNotifications] = js.undefined
  
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object DescribeBudgetNotificationsForAccountRequest {
  
  inline def apply(AccountId: AccountId): DescribeBudgetNotificationsForAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetNotificationsForAccountRequest]
  }
  
  extension [Self <: DescribeBudgetNotificationsForAccountRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsBudgetNotifications): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
