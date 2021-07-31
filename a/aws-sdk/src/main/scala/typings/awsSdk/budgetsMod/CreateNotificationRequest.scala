package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotificationRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget that you want to create a notification for.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId
  
  /**
    * The name of the budget that you want AWS to notify you about. Budget names must be unique within an account.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName
  
  /**
    * The notification that you want to create.
    */
  var Notification: typings.awsSdk.budgetsMod.Notification
  
  /**
    * A list of subscribers that you want to associate with the notification. Each notification can have one SNS subscriber and up to 10 email subscribers.
    */
  var Subscribers: typings.awsSdk.budgetsMod.Subscribers
}
object CreateNotificationRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscribers: Subscribers): CreateNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationRequest]
  }
  
  @scala.inline
  implicit class CreateNotificationRequestMutableBuilder[Self <: CreateNotificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value :_*))
  }
}
