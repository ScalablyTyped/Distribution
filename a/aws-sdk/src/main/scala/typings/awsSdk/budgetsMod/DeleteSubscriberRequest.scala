package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSubscriberRequest extends js.Object {
  /**
    * The accountId that is associated with the budget whose subscriber you want to delete.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The name of the budget whose subscriber you want to delete.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
  /**
    * The notification whose subscriber you want to delete.
    */
  var Notification: typings.awsSdk.budgetsMod.Notification = js.native
  /**
    * The subscriber that you want to delete.
    */
  var Subscriber: typings.awsSdk.budgetsMod.Subscriber = js.native
}

object DeleteSubscriberRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscriber: Subscriber): DeleteSubscriberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Subscriber = Subscriber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubscriberRequest]
  }
  @scala.inline
  implicit class DeleteSubscriberRequestOps[Self <: DeleteSubscriberRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBudgetName(value: BudgetName): Self = this.set("BudgetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotification(value: Notification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriber(value: Subscriber): Self = this.set("Subscriber", value.asInstanceOf[js.Any])
  }
  
}

