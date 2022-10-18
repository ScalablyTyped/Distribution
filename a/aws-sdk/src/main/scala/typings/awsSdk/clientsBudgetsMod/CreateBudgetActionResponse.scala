package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBudgetActionResponse extends StObject {
  
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    *  A system-generated universally unique identifier (UUID) for the action. 
    */
  var ActionId: typings.awsSdk.clientsBudgetsMod.ActionId
  
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
}
object CreateBudgetActionResponse {
  
  inline def apply(AccountId: AccountId, ActionId: ActionId, BudgetName: BudgetName): CreateBudgetActionResponse = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ActionId = ActionId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBudgetActionResponse]
  }
  
  extension [Self <: CreateBudgetActionResponse](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setActionId(value: ActionId): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
  }
}
