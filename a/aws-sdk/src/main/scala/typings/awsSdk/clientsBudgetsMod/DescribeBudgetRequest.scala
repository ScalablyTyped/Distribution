package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget that you want a description of.
    */
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    * The name of the budget that you want a description of.
    */
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
}
object DescribeBudgetRequest {
  
  inline def apply(AccountId: AccountId, BudgetName: BudgetName): DescribeBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetRequest]
  }
  
  extension [Self <: DescribeBudgetRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
  }
}
