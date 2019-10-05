package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBudgetsRequest extends js.Object {
  /**
    * The accountId that is associated with the budgets that you want descriptions of.
    */
  var AccountId: typings.awsDashSdk.clientsBudgetsMod.AccountId
  /**
    * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.MaxResults] = js.undefined
  /**
    * The pagination token that you include in your request to indicate the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object DescribeBudgetsRequest {
  @scala.inline
  def apply(AccountId: AccountId, MaxResults: Int | Double = null, NextToken: GenericString = null): DescribeBudgetsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeBudgetsRequest]
  }
}

