package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculatedSpend extends StObject {
  
  /**
    * The amount of cost, usage, RI units, or Savings Plans units that you used.
    */
  var ActualSpend: Spend
  
  /**
    * The amount of cost, usage, RI units, or Savings Plans units that you're forecasted to use.
    */
  var ForecastedSpend: js.UndefOr[Spend] = js.undefined
}
object CalculatedSpend {
  
  inline def apply(ActualSpend: Spend): CalculatedSpend = {
    val __obj = js.Dynamic.literal(ActualSpend = ActualSpend.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedSpend]
  }
  
  extension [Self <: CalculatedSpend](x: Self) {
    
    inline def setActualSpend(value: Spend): Self = StObject.set(x, "ActualSpend", value.asInstanceOf[js.Any])
    
    inline def setForecastedSpend(value: Spend): Self = StObject.set(x, "ForecastedSpend", value.asInstanceOf[js.Any])
    
    inline def setForecastedSpendUndefined: Self = StObject.set(x, "ForecastedSpend", js.undefined)
  }
}
