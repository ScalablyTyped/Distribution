package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSubscriberRequest extends js.Object {
  
  /**
    * The accountId that is associated with the budget whose subscriber you want to update.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  
  /**
    * The name of the budget whose subscriber you want to update.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
  
  /**
    * The updated subscriber that is associated with a budget notification.
    */
  var NewSubscriber: Subscriber = js.native
  
  /**
    * The notification whose subscriber you want to update.
    */
  var Notification: typings.awsSdk.budgetsMod.Notification = js.native
  
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
  
  @scala.inline
  implicit class UpdateSubscriberRequestOps[Self <: UpdateSubscriberRequest] (val x: Self) extends AnyVal {
    
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
    def setNewSubscriber(value: Subscriber): Self = this.set("NewSubscriber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: Notification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldSubscriber(value: Subscriber): Self = this.set("OldSubscriber", value.asInstanceOf[js.Any])
  }
}
