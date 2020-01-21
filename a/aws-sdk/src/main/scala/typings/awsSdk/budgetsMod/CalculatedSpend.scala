package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedSpend extends js.Object {
  /**
    * The amount of cost, usage, or RI units that you have used.
    */
  var ActualSpend: Spend = js.native
  /**
    * The amount of cost, usage, or RI units that you are forecasted to use.
    */
  var ForecastedSpend: js.UndefOr[Spend] = js.native
}

object CalculatedSpend {
  @scala.inline
  def apply(ActualSpend: Spend, ForecastedSpend: Spend = null): CalculatedSpend = {
    val __obj = js.Dynamic.literal(ActualSpend = ActualSpend.asInstanceOf[js.Any])
    if (ForecastedSpend != null) __obj.updateDynamic("ForecastedSpend")(ForecastedSpend.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedSpend]
  }
}

