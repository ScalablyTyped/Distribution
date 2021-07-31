package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculatedSpend extends StObject {
  
  /**
    * The amount of cost, usage, RI units, or Savings Plans units that you have used.
    */
  var ActualSpend: Spend
  
  /**
    * The amount of cost, usage, RI units, or Savings Plans units that you are forecasted to use.
    */
  var ForecastedSpend: js.UndefOr[Spend] = js.undefined
}
object CalculatedSpend {
  
  @scala.inline
  def apply(ActualSpend: Spend): CalculatedSpend = {
    val __obj = js.Dynamic.literal(ActualSpend = ActualSpend.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedSpend]
  }
  
  @scala.inline
  implicit class CalculatedSpendMutableBuilder[Self <: CalculatedSpend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualSpend(value: Spend): Self = StObject.set(x, "ActualSpend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastedSpend(value: Spend): Self = StObject.set(x, "ForecastedSpend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastedSpendUndefined: Self = StObject.set(x, "ForecastedSpend", js.undefined)
  }
}
