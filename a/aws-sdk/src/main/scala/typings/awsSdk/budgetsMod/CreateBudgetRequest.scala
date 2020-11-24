package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBudgetRequest extends js.Object {
  
  /**
    * The accountId that is associated with the budget.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  
  /**
    * The budget object that you want to create.
    */
  var Budget: typings.awsSdk.budgetsMod.Budget = js.native
  
  /**
    * A notification that you want to associate with a budget. A budget can have up to five notifications, and each notification can have one SNS subscriber and up to 10 email subscribers. If you include notifications and subscribers in your CreateBudget call, AWS creates the notifications and subscribers for you.
    */
  var NotificationsWithSubscribers: js.UndefOr[NotificationWithSubscribersList] = js.native
}
object CreateBudgetRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, Budget: Budget): CreateBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Budget = Budget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBudgetRequest]
  }
  
  @scala.inline
  implicit class CreateBudgetRequestOps[Self <: CreateBudgetRequest] (val x: Self) extends AnyVal {
    
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
    def setBudget(value: Budget): Self = this.set("Budget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsWithSubscribersVarargs(value: NotificationWithSubscribers*): Self = this.set("NotificationsWithSubscribers", js.Array(value :_*))
    
    @scala.inline
    def setNotificationsWithSubscribers(value: NotificationWithSubscribersList): Self = this.set("NotificationsWithSubscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationsWithSubscribers: Self = this.set("NotificationsWithSubscribers", js.undefined)
  }
}
