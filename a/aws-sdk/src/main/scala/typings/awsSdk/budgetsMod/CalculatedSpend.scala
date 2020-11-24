package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculatedSpend extends js.Object {
  
  /**
    * The amount of cost, usage, RI units, or Savings Plans units that you have used.
    */
  var ActualSpend: Spend = js.native
  
  /**
    * The amount of cost, usage, RI units, or Savings Plans units that you are forecasted to use.
    */
  var ForecastedSpend: js.UndefOr[Spend] = js.native
}
object CalculatedSpend {
  
  @scala.inline
  def apply(ActualSpend: Spend): CalculatedSpend = {
    val __obj = js.Dynamic.literal(ActualSpend = ActualSpend.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedSpend]
  }
  
  @scala.inline
  implicit class CalculatedSpendOps[Self <: CalculatedSpend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActualSpend(value: Spend): Self = this.set("ActualSpend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastedSpend(value: Spend): Self = this.set("ForecastedSpend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecastedSpend: Self = this.set("ForecastedSpend", js.undefined)
  }
}
