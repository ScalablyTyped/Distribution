package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBudgetRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget that you want to delete.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId
  
  /**
    * The name of the budget that you want to delete.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName
}
object DeleteBudgetRequest {
  
  inline def apply(AccountId: AccountId, BudgetName: BudgetName): DeleteBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBudgetRequest]
  }
  
  extension [Self <: DeleteBudgetRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
  }
}
