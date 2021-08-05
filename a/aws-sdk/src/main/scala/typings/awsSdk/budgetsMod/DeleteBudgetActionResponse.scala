package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBudgetActionResponse extends StObject {
  
  var AccountId: typings.awsSdk.budgetsMod.AccountId
  
  var Action: typings.awsSdk.budgetsMod.Action
  
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName
}
object DeleteBudgetActionResponse {
  
  inline def apply(AccountId: AccountId, Action: Action, BudgetName: BudgetName): DeleteBudgetActionResponse = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Action = Action.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBudgetActionResponse]
  }
  
  extension [Self <: DeleteBudgetActionResponse](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
  }
}
