package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubscriberRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose subscriber you want to update.
    */
  var AccountId: typings.awsDashSdk.clientsBudgetsMod.AccountId = js.native
  /**
    * The name of the budget whose subscriber you want to update.
    */
  var BudgetName: typings.awsDashSdk.clientsBudgetsMod.BudgetName = js.native
  /**
    * The updated subscriber that is associated with a budget notification.
    */
  var NewSubscriber: Subscriber = js.native
  /**
    * The notification whose subscriber you want to update.
    */
  var Notification: typings.awsDashSdk.clientsBudgetsMod.Notification = js.native
  /**
    * The previous subscriber that is associated with a budget notification.
    */
  var OldSubscriber: Subscriber = js.native
}

object UpdateSubscriberRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    NewSubscriber: Subscriber,
    Notification: Notification,
    OldSubscriber: Subscriber
  ): UpdateSubscriberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], NewSubscriber = NewSubscriber.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], OldSubscriber = OldSubscriber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateSubscriberRequest]
  }
}

