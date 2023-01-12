package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BudgetNotificationsForAccount extends StObject {
  
  var BudgetName: js.UndefOr[typings.awsSdk.clientsBudgetsMod.BudgetName] = js.undefined
  
  var Notifications: js.UndefOr[typings.awsSdk.clientsBudgetsMod.Notifications] = js.undefined
}
object BudgetNotificationsForAccount {
  
  inline def apply(): BudgetNotificationsForAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetNotificationsForAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BudgetNotificationsForAccount] (val x: Self) extends AnyVal {
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setBudgetNameUndefined: Self = StObject.set(x, "BudgetName", js.undefined)
    
    inline def setNotifications(value: Notifications): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "Notifications", js.undefined)
    
    inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "Notifications", js.Array(value*))
  }
}
