package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSubscriberRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want to create a subscriber for.
    */
  var AccountId: awsDashSdkLib.clientsBudgetsMod.AccountId
  /**
    * The name of the budget that you want to subscribe to. Budget names must be unique within an account.
    */
  var BudgetName: awsDashSdkLib.clientsBudgetsMod.BudgetName
  /**
    * The notification that you want to create a subscriber for.
    */
  var Notification: awsDashSdkLib.clientsBudgetsMod.Notification
  /**
    * The subscriber that you want to associate with a budget notification.
    */
  var Subscriber: awsDashSdkLib.clientsBudgetsMod.Subscriber
}

object CreateSubscriberRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscriber: Subscriber): CreateSubscriberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName, Notification = Notification, Subscriber = Subscriber)
  
    __obj.asInstanceOf[CreateSubscriberRequest]
  }
}

