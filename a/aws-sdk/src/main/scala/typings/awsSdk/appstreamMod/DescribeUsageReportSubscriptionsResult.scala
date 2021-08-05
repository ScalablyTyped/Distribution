package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUsageReportSubscriptionsResult extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the usage report subscription.
    */
  var UsageReportSubscriptions: js.UndefOr[UsageReportSubscriptionList] = js.undefined
}
object DescribeUsageReportSubscriptionsResult {
  
  inline def apply(): DescribeUsageReportSubscriptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsageReportSubscriptionsResult]
  }
  
  extension [Self <: DescribeUsageReportSubscriptionsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUsageReportSubscriptions(value: UsageReportSubscriptionList): Self = StObject.set(x, "UsageReportSubscriptions", value.asInstanceOf[js.Any])
    
    inline def setUsageReportSubscriptionsUndefined: Self = StObject.set(x, "UsageReportSubscriptions", js.undefined)
    
    inline def setUsageReportSubscriptionsVarargs(value: UsageReportSubscription*): Self = StObject.set(x, "UsageReportSubscriptions", js.Array(value :_*))
  }
}
