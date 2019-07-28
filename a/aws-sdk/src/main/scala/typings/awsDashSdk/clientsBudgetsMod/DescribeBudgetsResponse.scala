package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBudgetsResponse extends js.Object {
  /**
    * A list of budgets.
    */
  var Budgets: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.Budgets] = js.undefined
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object DescribeBudgetsResponse {
  @scala.inline
  def apply(Budgets: Budgets = null, NextToken: GenericString = null): DescribeBudgetsResponse = {
    val __obj = js.Dynamic.literal()
    if (Budgets != null) __obj.updateDynamic("Budgets")(Budgets)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeBudgetsResponse]
  }
}

