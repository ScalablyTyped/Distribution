package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BudgetedAndActualAmounts extends StObject {
  
  /**
    * Your actual costs or usage for a budget period.
    */
  var ActualAmount: js.UndefOr[Spend] = js.undefined
  
  /**
    * The amount of cost or usage that you created the budget for.
    */
  var BudgetedAmount: js.UndefOr[Spend] = js.undefined
  
  /**
    * The time period that's covered by this budget comparison.
    */
  var TimePeriod: js.UndefOr[typings.awsSdk.clientsBudgetsMod.TimePeriod] = js.undefined
}
object BudgetedAndActualAmounts {
  
  inline def apply(): BudgetedAndActualAmounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetedAndActualAmounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BudgetedAndActualAmounts] (val x: Self) extends AnyVal {
    
    inline def setActualAmount(value: Spend): Self = StObject.set(x, "ActualAmount", value.asInstanceOf[js.Any])
    
    inline def setActualAmountUndefined: Self = StObject.set(x, "ActualAmount", js.undefined)
    
    inline def setBudgetedAmount(value: Spend): Self = StObject.set(x, "BudgetedAmount", value.asInstanceOf[js.Any])
    
    inline def setBudgetedAmountUndefined: Self = StObject.set(x, "BudgetedAmount", js.undefined)
    
    inline def setTimePeriod(value: TimePeriod): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
  }
}
