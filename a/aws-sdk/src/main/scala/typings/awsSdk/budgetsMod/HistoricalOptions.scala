package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoricalOptions extends StObject {
  
  /**
    * The number of budget periods included in the moving-average calculation that determines your auto-adjusted budget amount. The maximum value depends on the TimeUnit granularity of the budget:   For the DAILY granularity, the maximum value is 60.   For the MONTHLY granularity, the maximum value is 12.   For the QUARTERLY granularity, the maximum value is 4.   For the ANNUALLY granularity, the maximum value is 1.  
    */
  var BudgetAdjustmentPeriod: AdjustmentPeriod
  
  /**
    * The integer that describes how many budget periods in your BudgetAdjustmentPeriod are included in the calculation of your current BudgetLimit. If the first budget period in your BudgetAdjustmentPeriod has no cost data, then that budget period isn’t included in the average that determines your budget limit.  For example, if you set BudgetAdjustmentPeriod as 4 quarters, but your account had no cost data in the first quarter, then only the last three quarters are included in the calculation. In this scenario, LookBackAvailablePeriods returns 3.  You can’t set your own LookBackAvailablePeriods. The value is automatically calculated from the BudgetAdjustmentPeriod and your historical cost data.
    */
  var LookBackAvailablePeriods: js.UndefOr[AdjustmentPeriod] = js.undefined
}
object HistoricalOptions {
  
  inline def apply(BudgetAdjustmentPeriod: AdjustmentPeriod): HistoricalOptions = {
    val __obj = js.Dynamic.literal(BudgetAdjustmentPeriod = BudgetAdjustmentPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoricalOptions]
  }
  
  extension [Self <: HistoricalOptions](x: Self) {
    
    inline def setBudgetAdjustmentPeriod(value: AdjustmentPeriod): Self = StObject.set(x, "BudgetAdjustmentPeriod", value.asInstanceOf[js.Any])
    
    inline def setLookBackAvailablePeriods(value: AdjustmentPeriod): Self = StObject.set(x, "LookBackAvailablePeriods", value.asInstanceOf[js.Any])
    
    inline def setLookBackAvailablePeriodsUndefined: Self = StObject.set(x, "LookBackAvailablePeriods", js.undefined)
  }
}
