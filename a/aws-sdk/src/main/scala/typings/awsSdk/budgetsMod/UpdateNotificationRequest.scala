package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNotificationRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose notification you want to update.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The name of the budget whose notification you want to update.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
  /**
    * The updated notification to be associated with a budget.
    */
  var NewNotification: Notification = js.native
  /**
    * The previous notification that is associated with a budget.
    */
  var OldNotification: Notification = js.native
}

object UpdateNotificationRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    NewNotification: Notification,
    OldNotification: Notification
  ): UpdateNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], NewNotification = NewNotification.asInstanceOf[js.Any], OldNotification = OldNotification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateNotificationRequest]
  }
}

