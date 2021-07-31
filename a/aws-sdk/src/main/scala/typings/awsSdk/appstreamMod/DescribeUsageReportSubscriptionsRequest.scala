package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUsageReportSubscriptionsRequest extends StObject {
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeUsageReportSubscriptionsRequest {
  
  @scala.inline
  def apply(): DescribeUsageReportSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsageReportSubscriptionsRequest]
  }
  
  @scala.inline
  implicit class DescribeUsageReportSubscriptionsRequestMutableBuilder[Self <: DescribeUsageReportSubscriptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
