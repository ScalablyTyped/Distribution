package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BudgetPerformanceHistory extends StObject {
  
  var BudgetName: js.UndefOr[typings.awsSdk.budgetsMod.BudgetName] = js.undefined
  
  var BudgetType: js.UndefOr[typings.awsSdk.budgetsMod.BudgetType] = js.undefined
  
  /**
    * A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
    */
  var BudgetedAndActualAmountsList: js.UndefOr[typings.awsSdk.budgetsMod.BudgetedAndActualAmountsList] = js.undefined
  
  /**
    * The history of the cost filters for a budget during the specified time period.
    */
  var CostFilters: js.UndefOr[typings.awsSdk.budgetsMod.CostFilters] = js.undefined
  
  /**
    * The history of the cost types for a budget during the specified time period.
    */
  var CostTypes: js.UndefOr[typings.awsSdk.budgetsMod.CostTypes] = js.undefined
  
  var TimeUnit: js.UndefOr[typings.awsSdk.budgetsMod.TimeUnit] = js.undefined
}
object BudgetPerformanceHistory {
  
  @scala.inline
  def apply(): BudgetPerformanceHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetPerformanceHistory]
  }
  
  @scala.inline
  implicit class BudgetPerformanceHistoryMutableBuilder[Self <: BudgetPerformanceHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetNameUndefined: Self = StObject.set(x, "BudgetName", js.undefined)
    
    @scala.inline
    def setBudgetType(value: BudgetType): Self = StObject.set(x, "BudgetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetTypeUndefined: Self = StObject.set(x, "BudgetType", js.undefined)
    
    @scala.inline
    def setBudgetedAndActualAmountsList(value: BudgetedAndActualAmountsList): Self = StObject.set(x, "BudgetedAndActualAmountsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetedAndActualAmountsListUndefined: Self = StObject.set(x, "BudgetedAndActualAmountsList", js.undefined)
    
    @scala.inline
    def setBudgetedAndActualAmountsListVarargs(value: BudgetedAndActualAmounts*): Self = StObject.set(x, "BudgetedAndActualAmountsList", js.Array(value :_*))
    
    @scala.inline
    def setCostFilters(value: CostFilters): Self = StObject.set(x, "CostFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostFiltersUndefined: Self = StObject.set(x, "CostFilters", js.undefined)
    
    @scala.inline
    def setCostTypes(value: CostTypes): Self = StObject.set(x, "CostTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostTypesUndefined: Self = StObject.set(x, "CostTypes", js.undefined)
    
    @scala.inline
    def setTimeUnit(value: TimeUnit): Self = StObject.set(x, "TimeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitUndefined: Self = StObject.set(x, "TimeUnit", js.undefined)
  }
}
