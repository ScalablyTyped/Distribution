package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNotificationRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget whose notification you want to update.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId
  
  /**
    * The name of the budget whose notification you want to update.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName
  
  /**
    * The updated notification to be associated with a budget.
    */
  var NewNotification: Notification
  
  /**
    * The previous notification that is associated with a budget.
    */
  var OldNotification: Notification
}
object UpdateNotificationRequest {
  
  @scala.inline
  def apply(
    AccountId: AccountId,
    BudgetName: BudgetName,
    NewNotification: Notification,
    OldNotification: Notification
  ): UpdateNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], NewNotification = NewNotification.asInstanceOf[js.Any], OldNotification = OldNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationRequest]
  }
  
  @scala.inline
  implicit class UpdateNotificationRequestMutableBuilder[Self <: UpdateNotificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewNotification(value: Notification): Self = StObject.set(x, "NewNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldNotification(value: Notification): Self = StObject.set(x, "OldNotification", value.asInstanceOf[js.Any])
  }
}
