package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget.
    */
  var AccountId: AccountId
  /**
    * The budget object that you want to create.
    */
  var Budget: Budget
  /**
    * A notification that you want to associate with a budget. A budget can have up to five notifications, and each notification can have one SNS subscriber and up to 10 email subscribers. If you include notifications and subscribers in your CreateBudget call, AWS creates the notifications and subscribers for you.
    */
  var NotificationsWithSubscribers: js.UndefOr[NotificationWithSubscribersList] = js.undefined
}

object CreateBudgetRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    Budget: Budget,
    NotificationsWithSubscribers: NotificationWithSubscribersList = null
  ): CreateBudgetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccountId")(AccountId)
    __obj.updateDynamic("Budget")(Budget)
    if (NotificationsWithSubscribers != null) __obj.updateDynamic("NotificationsWithSubscribers")(NotificationsWithSubscribers)
    __obj.asInstanceOf[CreateBudgetRequest]
  }
}

