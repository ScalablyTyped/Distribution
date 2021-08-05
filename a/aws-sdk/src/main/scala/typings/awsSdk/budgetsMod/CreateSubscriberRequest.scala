package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubscriberRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget that you want to create a subscriber for.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId
  
  /**
    * The name of the budget that you want to subscribe to. Budget names must be unique within an account.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName
  
  /**
    * The notification that you want to create a subscriber for.
    */
  var Notification: typings.awsSdk.budgetsMod.Notification
  
  /**
    * The subscriber that you want to associate with a budget notification.
    */
  var Subscriber: typings.awsSdk.budgetsMod.Subscriber
}
object CreateSubscriberRequest {
  
  inline def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscriber: Subscriber): CreateSubscriberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Subscriber = Subscriber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubscriberRequest]
  }
  
  extension [Self <: CreateSubscriberRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setSubscriber(value: Subscriber): Self = StObject.set(x, "Subscriber", value.asInstanceOf[js.Any])
  }
}
