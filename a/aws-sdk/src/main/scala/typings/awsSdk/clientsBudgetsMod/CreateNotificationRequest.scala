package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotificationRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget that you want to create a notification for.
    */
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    * The name of the budget that you want Amazon Web Services to notify you about. Budget names must be unique within an account.
    */
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
  
  /**
    * The notification that you want to create.
    */
  var Notification: typings.awsSdk.clientsBudgetsMod.Notification
  
  /**
    * A list of subscribers that you want to associate with the notification. Each notification can have one SNS subscriber and up to 10 email subscribers.
    */
  var Subscribers: typings.awsSdk.clientsBudgetsMod.Subscribers
}
object CreateNotificationRequest {
  
  inline def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscribers: Subscribers): CreateNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationRequest]
  }
  
  extension [Self <: CreateNotificationRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value*))
  }
}
