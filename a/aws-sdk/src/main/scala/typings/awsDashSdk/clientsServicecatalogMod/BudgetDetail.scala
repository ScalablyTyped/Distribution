package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetDetail extends js.Object {
  /**
    * Name of the associated budget.
    */
  var BudgetName: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.BudgetName] = js.undefined
}

object BudgetDetail {
  @scala.inline
  def apply(BudgetName: BudgetName = null): BudgetDetail = {
    val __obj = js.Dynamic.literal()
    if (BudgetName != null) __obj.updateDynamic("BudgetName")(BudgetName)
    __obj.asInstanceOf[BudgetDetail]
  }
}

