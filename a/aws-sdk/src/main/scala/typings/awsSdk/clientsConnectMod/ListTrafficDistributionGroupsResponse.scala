package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrafficDistributionGroupsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * A list of traffic distribution groups.
    */
  var TrafficDistributionGroupSummaryList: js.UndefOr[typings.awsSdk.clientsConnectMod.TrafficDistributionGroupSummaryList] = js.undefined
}
object ListTrafficDistributionGroupsResponse {
  
  inline def apply(): ListTrafficDistributionGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrafficDistributionGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTrafficDistributionGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrafficDistributionGroupSummaryList(value: TrafficDistributionGroupSummaryList): Self = StObject.set(x, "TrafficDistributionGroupSummaryList", value.asInstanceOf[js.Any])
    
    inline def setTrafficDistributionGroupSummaryListUndefined: Self = StObject.set(x, "TrafficDistributionGroupSummaryList", js.undefined)
    
    inline def setTrafficDistributionGroupSummaryListVarargs(value: TrafficDistributionGroupSummary*): Self = StObject.set(x, "TrafficDistributionGroupSummaryList", js.Array(value*))
  }
}
