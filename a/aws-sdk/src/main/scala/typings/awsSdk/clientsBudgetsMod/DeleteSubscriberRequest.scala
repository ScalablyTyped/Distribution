package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSubscriberRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget whose subscriber you want to delete.
    */
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    * The name of the budget whose subscriber you want to delete.
    */
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
  
  /**
    * The notification whose subscriber you want to delete.
    */
  var Notification: typings.awsSdk.clientsBudgetsMod.Notification
  
  /**
    * The subscriber that you want to delete.
    */
  var Subscriber: typings.awsSdk.clientsBudgetsMod.Subscriber
}
object DeleteSubscriberRequest {
  
  inline def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification, Subscriber: Subscriber): DeleteSubscriberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Subscriber = Subscriber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubscriberRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSubscriberRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setSubscriber(value: Subscriber): Self = StObject.set(x, "Subscriber", value.asInstanceOf[js.Any])
  }
}
