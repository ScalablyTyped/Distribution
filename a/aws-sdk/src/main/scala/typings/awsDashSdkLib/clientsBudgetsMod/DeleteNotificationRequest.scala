package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNotificationRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose notification you want to delete.
    */
  var AccountId: awsDashSdkLib.clientsBudgetsMod.AccountId
  /**
    * The name of the budget whose notification you want to delete.
    */
  var BudgetName: awsDashSdkLib.clientsBudgetsMod.BudgetName
  /**
    * The notification that you want to delete.
    */
  var Notification: awsDashSdkLib.clientsBudgetsMod.Notification
}

object DeleteNotificationRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification): DeleteNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName, Notification = Notification)
  
    __obj.asInstanceOf[DeleteNotificationRequest]
  }
}

