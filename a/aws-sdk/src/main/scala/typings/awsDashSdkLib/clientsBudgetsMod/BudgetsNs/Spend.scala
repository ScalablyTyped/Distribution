package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Spend extends js.Object {
  /**
       * The cost or usage amount associated with a budget forecast, actual spend, or budget threshold.
       */
  var Amount: NumericValue
  /**
       * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB.
       */
  var Unit: UnitValue
}

