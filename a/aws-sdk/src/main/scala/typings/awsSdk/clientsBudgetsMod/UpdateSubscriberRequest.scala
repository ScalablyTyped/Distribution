package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubscriberRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget whose subscriber you want to update.
    */
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    * The name of the budget whose subscriber you want to update.
    */
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
  
  /**
    * The updated subscriber that is associated with a budget notification.
    */
  var NewSubscriber: Subscriber
  
  /**
    * The notification whose subscriber you want to update.
    */
  var Notification: typings.awsSdk.clientsBudgetsMod.Notification
  
  /**
    * The previous subscriber that is associated with a budget notification.
    */
  var OldSubscriber: Subscriber
}
object UpdateSubscriberRequest {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: UpdateSubscriberRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setNewSubscriber(value: Subscriber): Self = StObject.set(x, "NewSubscriber", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setOldSubscriber(value: Subscriber): Self = StObject.set(x, "OldSubscriber", value.asInstanceOf[js.Any])
  }
}
