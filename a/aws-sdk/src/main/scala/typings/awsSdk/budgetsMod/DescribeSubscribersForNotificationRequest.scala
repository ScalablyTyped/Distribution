package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubscribersForNotificationRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose subscribers you want descriptions of.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The name of the budget whose subscribers you want descriptions of.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
  /**
    * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.budgetsMod.MaxResults] = js.native
  /**
    * The pagination token that you include in your request to indicate the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * The notification whose subscribers you want to list.
    */
  var Notification: typings.awsSdk.budgetsMod.Notification = js.native
}

object DescribeSubscribersForNotificationRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    Notification: Notification,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: GenericString = null
  ): DescribeSubscribersForNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscribersForNotificationRequest]
  }
}

