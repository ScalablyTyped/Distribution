package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBudgetRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId
  
  /**
    * The budget object that you want to create.
    */
  var Budget: typings.awsSdk.budgetsMod.Budget
  
  /**
    * A notification that you want to associate with a budget. A budget can have up to five notifications, and each notification can have one SNS subscriber and up to 10 email subscribers. If you include notifications and subscribers in your CreateBudget call, AWS creates the notifications and subscribers for you.
    */
  var NotificationsWithSubscribers: js.UndefOr[NotificationWithSubscribersList] = js.undefined
}
object CreateBudgetRequest {
  
  inline def apply(AccountId: AccountId, Budget: Budget): CreateBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Budget = Budget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBudgetRequest]
  }
  
  extension [Self <: CreateBudgetRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudget(value: Budget): Self = StObject.set(x, "Budget", value.asInstanceOf[js.Any])
    
    inline def setNotificationsWithSubscribers(value: NotificationWithSubscribersList): Self = StObject.set(x, "NotificationsWithSubscribers", value.asInstanceOf[js.Any])
    
    inline def setNotificationsWithSubscribersUndefined: Self = StObject.set(x, "NotificationsWithSubscribers", js.undefined)
    
    inline def setNotificationsWithSubscribersVarargs(value: NotificationWithSubscribers*): Self = StObject.set(x, "NotificationsWithSubscribers", js.Array(value :_*))
  }
}
