package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSubscriberRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose subscriber you want to delete.
    */
  var AccountId: awsDashSdkLib.clientsBudgetsMod.AccountId
  /**
    * The name of the budget whose subscriber you want to delete.
    */
  var BudgetName: awsDashSdkLib.clientsBudgetsMod.BudgetName
  /**
    * The notification whose subscriber you want to delete.
    */
  var Notification: awsDashSdkLib.clientsBudgetsMod.Notification
  /**
    * The subscriber that you want to delete.
    */
  var Subscriber: awsDashSdkLib.clientsBudgetsMod.Subscriber
}

object DeleteSubscriberRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscriber: Subscriber): DeleteSubscriberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName, Notification = Notification, Subscriber = Subscriber)
  
    __obj.asInstanceOf[DeleteSubscriberRequest]
  }
}

