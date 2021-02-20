package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget that you want a description of.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  
  /**
    * The name of the budget that you want a description of.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
}
object DescribeBudgetRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DescribeBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetRequest]
  }
  
  @scala.inline
  implicit class DescribeBudgetRequestMutableBuilder[Self <: DescribeBudgetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
  }
}
