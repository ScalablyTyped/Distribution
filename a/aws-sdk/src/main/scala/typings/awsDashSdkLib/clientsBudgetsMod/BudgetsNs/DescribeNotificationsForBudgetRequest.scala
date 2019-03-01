package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNotificationsForBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose notifications you want descriptions of.
    */
  var AccountId: AccountId
  /**
    * The name of the budget whose notifications you want descriptions of.
    */
  var BudgetName: BudgetName
  /**
    * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
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
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: GenericString = null
  ): DescribeNotificationsForBudgetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccountId")(AccountId)
    __obj.updateDynamic("BudgetName")(BudgetName)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeNotificationsForBudgetRequest]
  }
}

