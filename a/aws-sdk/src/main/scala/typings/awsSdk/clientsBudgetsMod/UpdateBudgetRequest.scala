package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBudgetRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget that you want to update.
    */
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    * The budget that you want to update your budget to.
    */
  var NewBudget: Budget
}
object UpdateBudgetRequest {
  
  inline def apply(AccountId: AccountId, NewBudget: Budget): UpdateBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], NewBudget = NewBudget.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBudgetRequest]
  }
  
  extension [Self <: UpdateBudgetRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setNewBudget(value: Budget): Self = StObject.set(x, "NewBudget", value.asInstanceOf[js.Any])
  }
}
