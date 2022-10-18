package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BudgetPerformanceHistory extends StObject {
  
  var BudgetName: js.UndefOr[typings.awsSdk.clientsBudgetsMod.BudgetName] = js.undefined
  
  var BudgetType: js.UndefOr[typings.awsSdk.clientsBudgetsMod.BudgetType] = js.undefined
  
  /**
    * A list of amounts of cost or usage that you created budgets for, which are compared to your actual costs or usage.
    */
  var BudgetedAndActualAmountsList: js.UndefOr[typings.awsSdk.clientsBudgetsMod.BudgetedAndActualAmountsList] = js.undefined
  
  /**
    * The history of the cost filters for a budget during the specified time period.
    */
  var CostFilters: js.UndefOr[typings.awsSdk.clientsBudgetsMod.CostFilters] = js.undefined
  
  /**
    * The history of the cost types for a budget during the specified time period.
    */
  var CostTypes: js.UndefOr[typings.awsSdk.clientsBudgetsMod.CostTypes] = js.undefined
  
  var TimeUnit: js.UndefOr[typings.awsSdk.clientsBudgetsMod.TimeUnit] = js.undefined
}
object BudgetPerformanceHistory {
  
  inline def apply(): BudgetPerformanceHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetPerformanceHistory]
  }
  
  extension [Self <: BudgetPerformanceHistory](x: Self) {
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setBudgetNameUndefined: Self = StObject.set(x, "BudgetName", js.undefined)
    
    inline def setBudgetType(value: BudgetType): Self = StObject.set(x, "BudgetType", value.asInstanceOf[js.Any])
    
    inline def setBudgetTypeUndefined: Self = StObject.set(x, "BudgetType", js.undefined)
    
    inline def setBudgetedAndActualAmountsList(value: BudgetedAndActualAmountsList): Self = StObject.set(x, "BudgetedAndActualAmountsList", value.asInstanceOf[js.Any])
    
    inline def setBudgetedAndActualAmountsListUndefined: Self = StObject.set(x, "BudgetedAndActualAmountsList", js.undefined)
    
    inline def setBudgetedAndActualAmountsListVarargs(value: BudgetedAndActualAmounts*): Self = StObject.set(x, "BudgetedAndActualAmountsList", js.Array(value*))
    
    inline def setCostFilters(value: CostFilters): Self = StObject.set(x, "CostFilters", value.asInstanceOf[js.Any])
    
    inline def setCostFiltersUndefined: Self = StObject.set(x, "CostFilters", js.undefined)
    
    inline def setCostTypes(value: CostTypes): Self = StObject.set(x, "CostTypes", value.asInstanceOf[js.Any])
    
    inline def setCostTypesUndefined: Self = StObject.set(x, "CostTypes", js.undefined)
    
    inline def setTimeUnit(value: TimeUnit): Self = StObject.set(x, "TimeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "TimeUnit", js.undefined)
  }
}
