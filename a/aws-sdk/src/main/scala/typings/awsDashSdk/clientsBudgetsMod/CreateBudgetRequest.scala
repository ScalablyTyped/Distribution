package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget.
    */
  var AccountId: typings.awsDashSdk.clientsBudgetsMod.AccountId = js.native
  /**
    * The budget object that you want to create.
    */
  var Budget: typings.awsDashSdk.clientsBudgetsMod.Budget = js.native
  /**
    * A notification that you want to associate with a budget. A budget can have up to five notifications, and each notification can have one SNS subscriber and up to 10 email subscribers. If you include notifications and subscribers in your CreateBudget call, AWS creates the notifications and subscribers for you.
    */
  var NotificationsWithSubscribers: js.UndefOr[NotificationWithSubscribersList] = js.native
}

object CreateBudgetRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    Budget: Budget,
    NotificationsWithSubscribers: NotificationWithSubscribersList = null
  ): CreateBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Budget = Budget.asInstanceOf[js.Any])
    if (NotificationsWithSubscribers != null) __obj.updateDynamic("NotificationsWithSubscribers")(NotificationsWithSubscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBudgetRequest]
  }
}

