package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBudgetActionResponse extends StObject {
  
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
  
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
  
  inline def apply(AccountId: AccountId, BudgetName: BudgetName, NewAction: Action, OldAction: Action): UpdateBudgetActionResponse = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], NewAction = NewAction.asInstanceOf[js.Any], OldAction = OldAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBudgetActionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBudgetActionResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setNewAction(value: Action): Self = StObject.set(x, "NewAction", value.asInstanceOf[js.Any])
    
    inline def setOldAction(value: Action): Self = StObject.set(x, "OldAction", value.asInstanceOf[js.Any])
  }
}
