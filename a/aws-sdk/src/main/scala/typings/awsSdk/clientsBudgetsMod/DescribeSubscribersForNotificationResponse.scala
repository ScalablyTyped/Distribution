package typings.awsSdk.clientsBudgetsMod

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
  var Subscribers: js.UndefOr[typings.awsSdk.clientsBudgetsMod.Subscribers] = js.undefined
}
object DescribeSubscribersForNotificationResponse {
  
  inline def apply(): DescribeSubscribersForNotificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubscribersForNotificationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSubscribersForNotificationResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersUndefined: Self = StObject.set(x, "Subscribers", js.undefined)
    
    inline def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value*))
  }
}
