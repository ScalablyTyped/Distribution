package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAwsNetworkPerformanceMetricSubscriptionsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the current Infrastructure Performance subscriptions.
    */
  var Subscriptions: js.UndefOr[SubscriptionList] = js.undefined
}
object DescribeAwsNetworkPerformanceMetricSubscriptionsResult {
  
  inline def apply(): DescribeAwsNetworkPerformanceMetricSubscriptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAwsNetworkPerformanceMetricSubscriptionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAwsNetworkPerformanceMetricSubscriptionsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubscriptions(value: SubscriptionList): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "Subscriptions", js.Array(value*))
  }
}
