package typings
package awsDashSdkLib.clientsBudgetsMod.BudgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSubscriberRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose subscriber you want to delete.
    */
  var AccountId: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.AccountId
  /**
    * The name of the budget whose subscriber you want to delete.
    */
  var BudgetName: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.BudgetName
  /**
    * The notification whose subscriber you want to delete.
    */
  var Notification: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.Notification
  /**
    * The subscriber that you want to delete.
    */
  var Subscriber: awsDashSdkLib.clientsBudgetsMod.BudgetsNs.Subscriber
}

object DeleteSubscriberRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscriber: Subscriber): DeleteSubscriberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName, Notification = Notification, Subscriber = Subscriber)
  
    __obj.asInstanceOf[DeleteSubscriberRequest]
  }
}

