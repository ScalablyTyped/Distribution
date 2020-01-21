package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBudgetsResponse extends js.Object {
  /**
    * A list of budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.budgetsMod.Budgets] = js.native
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object DescribeBudgetsResponse {
  @scala.inline
  def apply(Budgets: Budgets = null, NextToken: GenericString = null): DescribeBudgetsResponse = {
    val __obj = js.Dynamic.literal()
    if (Budgets != null) __obj.updateDynamic("Budgets")(Budgets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetsResponse]
  }
}

