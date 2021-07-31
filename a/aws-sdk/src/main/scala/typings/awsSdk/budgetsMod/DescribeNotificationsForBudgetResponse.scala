package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotificationsForBudgetResponse extends StObject {
  
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A list of notifications that are associated with a budget.
    */
  var Notifications: js.UndefOr[typings.awsSdk.budgetsMod.Notifications] = js.undefined
}
object DescribeNotificationsForBudgetResponse {
  
  @scala.inline
  def apply(): DescribeNotificationsForBudgetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotificationsForBudgetResponse]
  }
  
  @scala.inline
  implicit class DescribeNotificationsForBudgetResponseMutableBuilder[Self <: DescribeNotificationsForBudgetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNotifications(value: Notifications): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsUndefined: Self = StObject.set(x, "Notifications", js.undefined)
    
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "Notifications", js.Array(value :_*))
  }
}
