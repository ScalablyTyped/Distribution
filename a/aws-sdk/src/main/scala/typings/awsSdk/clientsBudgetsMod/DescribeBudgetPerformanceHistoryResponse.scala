package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBudgetPerformanceHistoryResponse extends StObject {
  
  /**
    * The history of how often the budget has gone into an ALARM state. For DAILY budgets, the history saves the state of the budget for the last 60 days. For MONTHLY budgets, the history saves the state of the budget for the current month plus the last 12 months. For QUARTERLY budgets, the history saves the state of the budget for the last four quarters.
    */
  var BudgetPerformanceHistory: js.UndefOr[typings.awsSdk.clientsBudgetsMod.BudgetPerformanceHistory] = js.undefined
  
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object DescribeBudgetPerformanceHistoryResponse {
  
  inline def apply(): DescribeBudgetPerformanceHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetPerformanceHistoryResponse]
  }
  
  extension [Self <: DescribeBudgetPerformanceHistoryResponse](x: Self) {
    
    inline def setBudgetPerformanceHistory(value: BudgetPerformanceHistory): Self = StObject.set(x, "BudgetPerformanceHistory", value.asInstanceOf[js.Any])
    
    inline def setBudgetPerformanceHistoryUndefined: Self = StObject.set(x, "BudgetPerformanceHistory", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
