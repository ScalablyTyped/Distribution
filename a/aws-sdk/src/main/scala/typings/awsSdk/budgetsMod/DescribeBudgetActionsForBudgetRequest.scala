package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetActionsForBudgetRequest extends StObject {
  
  var AccountId: typings.awsSdk.budgetsMod.AccountId
  
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName
  
  var MaxResults: js.UndefOr[typings.awsSdk.budgetsMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object DescribeBudgetActionsForBudgetRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DescribeBudgetActionsForBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionsForBudgetRequest]
  }
  
  @scala.inline
  implicit class DescribeBudgetActionsForBudgetRequestMutableBuilder[Self <: DescribeBudgetActionsForBudgetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
