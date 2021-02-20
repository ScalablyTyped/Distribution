package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetPerformanceHistoryResponse extends StObject {
  
  /**
    * The history of how often the budget has gone into an ALARM state. For DAILY budgets, the history saves the state of the budget for the last 60 days. For MONTHLY budgets, the history saves the state of the budget for the current month plus the last 12 months. For QUARTERLY budgets, the history saves the state of the budget for the last four quarters.
    */
  var BudgetPerformanceHistory: js.UndefOr[typings.awsSdk.budgetsMod.BudgetPerformanceHistory] = js.native
  
  var NextToken: js.UndefOr[GenericString] = js.native
}
object DescribeBudgetPerformanceHistoryResponse {
  
  @scala.inline
  def apply(): DescribeBudgetPerformanceHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetPerformanceHistoryResponse]
  }
  
  @scala.inline
  implicit class DescribeBudgetPerformanceHistoryResponseMutableBuilder[Self <: DescribeBudgetPerformanceHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudgetPerformanceHistory(value: BudgetPerformanceHistory): Self = StObject.set(x, "BudgetPerformanceHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetPerformanceHistoryUndefined: Self = StObject.set(x, "BudgetPerformanceHistory", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
