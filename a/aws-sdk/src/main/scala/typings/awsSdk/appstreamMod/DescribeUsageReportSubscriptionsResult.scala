package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUsageReportSubscriptionsResult extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the usage report subscription.
    */
  var UsageReportSubscriptions: js.UndefOr[UsageReportSubscriptionList] = js.native
}
object DescribeUsageReportSubscriptionsResult {
  
  @scala.inline
  def apply(): DescribeUsageReportSubscriptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsageReportSubscriptionsResult]
  }
  
  @scala.inline
  implicit class DescribeUsageReportSubscriptionsResultMutableBuilder[Self <: DescribeUsageReportSubscriptionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUsageReportSubscriptions(value: UsageReportSubscriptionList): Self = StObject.set(x, "UsageReportSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageReportSubscriptionsUndefined: Self = StObject.set(x, "UsageReportSubscriptions", js.undefined)
    
    @scala.inline
    def setUsageReportSubscriptionsVarargs(value: UsageReportSubscription*): Self = StObject.set(x, "UsageReportSubscriptions", js.Array(value :_*))
  }
}
