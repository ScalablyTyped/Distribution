package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTrafficPoliciesResponse extends js.Object {
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
    * A list that contains one TrafficPolicySummary element for each traffic policy that was created by the current AWS account.
    */
  var TrafficPolicySummaries: awsDashSdkLib.clientsRoute53Mod.TrafficPolicySummaries
}

object ListTrafficPoliciesResponse {
  @scala.inline
  def apply(
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    TrafficPolicyIdMarker: TrafficPolicyId,
    TrafficPolicySummaries: TrafficPolicySummaries
  ): ListTrafficPoliciesResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated, MaxItems = MaxItems, TrafficPolicyIdMarker = TrafficPolicyIdMarker, TrafficPolicySummaries = TrafficPolicySummaries)
  
    __obj.asInstanceOf[ListTrafficPoliciesResponse]
  }
}

