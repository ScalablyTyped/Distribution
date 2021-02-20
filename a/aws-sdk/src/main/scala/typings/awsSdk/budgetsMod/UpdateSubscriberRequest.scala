package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSubscriberRequest extends StObject {
  
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
  implicit class UpdateSubscriberRequestMutableBuilder[Self <: UpdateSubscriberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSubscriber(value: Subscriber): Self = StObject.set(x, "NewSubscriber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldSubscriber(value: Subscriber): Self = StObject.set(x, "OldSubscriber", value.asInstanceOf[js.Any])
  }
}
