package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNotificationRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose notification you want to delete.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The name of the budget whose notification you want to delete.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
  /**
    * The notification that you want to delete.
    */
  var Notification: typings.awsSdk.budgetsMod.Notification = js.native
}

object DeleteNotificationRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification): DeleteNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationRequest]
  }
}

