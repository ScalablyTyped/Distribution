package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBudgetActionResponse extends StObject {
  
  var AccountId: typings.awsSdk.budgetsMod.AccountId
  
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName
  
  /**
    *  The updated action resource information. 
    */
  var NewAction: Action
  
  /**
    *  The previous action resource information. 
    */
  var OldAction: Action
}
object UpdateBudgetActionResponse {
  
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, NewAction: Action, OldAction: Action): UpdateBudgetActionResponse = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], NewAction = NewAction.asInstanceOf[js.Any], OldAction = OldAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBudgetActionResponse]
  }
  
  @scala.inline
  implicit class UpdateBudgetActionResponseMutableBuilder[Self <: UpdateBudgetActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewAction(value: Action): Self = StObject.set(x, "NewAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldAction(value: Action): Self = StObject.set(x, "OldAction", value.asInstanceOf[js.Any])
  }
}
