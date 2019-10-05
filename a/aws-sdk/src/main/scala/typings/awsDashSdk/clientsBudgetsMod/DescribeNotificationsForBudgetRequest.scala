package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNotificationsForBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose notifications you want descriptions of.
    */
  var AccountId: typings.awsDashSdk.clientsBudgetsMod.AccountId
  /**
    * The name of the budget whose notifications you want descriptions of.
    */
  var BudgetName: typings.awsDashSdk.clientsBudgetsMod.BudgetName
  /**
    * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.MaxResults] = js.undefined
  /**
    * The pagination token that you include in your request to indicate the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object DescribeNotificationsForBudgetRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    MaxResults: Int | Double = null,
    NextToken: GenericString = null
  ): DescribeNotificationsForBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeNotificationsForBudgetRequest]
  }
}

