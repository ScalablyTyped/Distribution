package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNotificationRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want to create a notification for.
    */
  var AccountId: typings.awsDashSdk.clientsBudgetsMod.AccountId
  /**
    * The name of the budget that you want AWS to notify you about. Budget names must be unique within an account.
    */
  var BudgetName: typings.awsDashSdk.clientsBudgetsMod.BudgetName
  /**
    * The notification that you want to create.
    */
  var Notification: typings.awsDashSdk.clientsBudgetsMod.Notification
  /**
    * A list of subscribers that you want to associate with the notification. Each notification can have one SNS subscriber and up to 10 email subscribers.
    */
  var Subscribers: typings.awsDashSdk.clientsBudgetsMod.Subscribers
}

object CreateNotificationRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscribers: Subscribers): CreateNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BudgetName = BudgetName, Notification = Notification, Subscribers = Subscribers)
  
    __obj.asInstanceOf[CreateNotificationRequest]
  }
}

