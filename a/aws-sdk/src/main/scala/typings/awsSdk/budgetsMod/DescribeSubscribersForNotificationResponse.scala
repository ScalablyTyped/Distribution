package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubscribersForNotificationResponse extends StObject {
  
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A list of subscribers that are associated with a notification.
    */
  var Subscribers: js.UndefOr[typings.awsSdk.budgetsMod.Subscribers] = js.undefined
}
object DescribeSubscribersForNotificationResponse {
  
  @scala.inline
  def apply(): DescribeSubscribersForNotificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubscribersForNotificationResponse]
  }
  
  @scala.inline
  implicit class DescribeSubscribersForNotificationResponseMutableBuilder[Self <: DescribeSubscribersForNotificationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersUndefined: Self = StObject.set(x, "Subscribers", js.undefined)
    
    @scala.inline
    def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value :_*))
  }
}
