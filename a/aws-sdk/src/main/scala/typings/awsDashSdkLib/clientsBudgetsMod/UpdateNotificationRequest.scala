package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateNotificationRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose notification you want to update.
    */
  var AccountId: awsDashSdkLib.clientsBudgetsMod.AccountId
  /**
    * The name of the budget whose notification you want to update.
    */
  var BudgetName: awsDashSdkLib.clientsBudgetsMod.BudgetName
  /**
    * The updated notification to be associated with a budget.
    */
  var NewNotification: Notification
  /**
    * The previous notification that is associated with a budget.
    */
  var OldNotification: Notification
}

object UpdateNotificationRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    NewNotification: Notification,
    OldNotification: Notification
  ): UpdateNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName, NewNotification = NewNotification, OldNotification = OldNotification)
  
    __obj.asInstanceOf[UpdateNotificationRequest]
  }
}

