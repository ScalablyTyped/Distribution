package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrafficPoliciesResponse extends StObject {
  
  /**
    * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you can get the next group of traffic policies by submitting another ListTrafficPolicies request and specifying the value of TrafficPolicyIdMarker in the TrafficPolicyIdMarker request parameter.
    */
  var IsTruncated: PageTruncated
  
  /**
    * The value that you specified for the MaxItems parameter in the ListTrafficPolicies request that produced the current response.
    */
  var MaxItems: PageMaxItems
  
  /**
    * If the value of IsTruncated is true, TrafficPolicyIdMarker is the ID of the first traffic policy in the next group of MaxItems traffic policies.
    */
  var TrafficPolicyIdMarker: TrafficPolicyId
  
  /**
    * A list that contains one TrafficPolicySummary element for each traffic policy that was created by the current Amazon Web Services account.
    */
  var TrafficPolicySummaries: typings.awsSdk.clientsRoute53Mod.TrafficPolicySummaries
}
object ListTrafficPoliciesResponse {
  
  inline def apply(
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    TrafficPolicyIdMarker: TrafficPolicyId,
    TrafficPolicySummaries: TrafficPolicySummaries
  ): ListTrafficPoliciesResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], TrafficPolicyIdMarker = TrafficPolicyIdMarker.asInstanceOf[js.Any], TrafficPolicySummaries = TrafficPolicySummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTrafficPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setIsTruncated(value: PageTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicyIdMarker(value: TrafficPolicyId): Self = StObject.set(x, "TrafficPolicyIdMarker", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicySummaries(value: TrafficPolicySummaries): Self = StObject.set(x, "TrafficPolicySummaries", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicySummariesVarargs(value: TrafficPolicySummary*): Self = StObject.set(x, "TrafficPolicySummaries", js.Array(value*))
  }
}
