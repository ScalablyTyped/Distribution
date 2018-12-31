package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

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

