package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNotificationRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget whose notification you want to delete.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId
  
  /**
    * The name of the budget whose notification you want to delete.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName
  
  /**
    * The notification that you want to delete.
    */
  var Notification: typings.awsSdk.budgetsMod.Notification
}
object DeleteNotificationRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification): DeleteNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationRequest]
  }
  
  @scala.inline
  implicit class DeleteNotificationRequestMutableBuilder[Self <: DeleteNotificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
  }
}
