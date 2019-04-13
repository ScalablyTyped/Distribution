package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalculatedSpend extends js.Object {
  /**
    * The amount of cost, usage, or RI units that you have used.
    */
  var ActualSpend: Spend
  /**
    * The amount of cost, usage, or RI units that you are forecasted to use.
    */
  var ForecastedSpend: js.UndefOr[Spend] = js.undefined
}

object CalculatedSpend {
  @scala.inline
  def apply(ActualSpend: Spend, ForecastedSpend: Spend = null): CalculatedSpend = {
    val __obj = js.Dynamic.literal(ActualSpend = ActualSpend)
    if (ForecastedSpend != null) __obj.updateDynamic("ForecastedSpend")(ForecastedSpend)
    __obj.asInstanceOf[CalculatedSpend]
  }
}

