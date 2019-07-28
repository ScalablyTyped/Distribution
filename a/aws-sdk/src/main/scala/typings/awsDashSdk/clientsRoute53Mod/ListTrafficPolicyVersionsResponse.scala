package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTrafficPolicyVersionsResponse extends js.Object {
  /**
    * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you can get the next group of traffic policies by submitting another ListTrafficPolicyVersions request and specifying the value of NextMarker in the marker parameter.
    */
  var IsTruncated: PageTruncated
  /**
    * The value that you specified for the maxitems parameter in the ListTrafficPolicyVersions request that produced the current response.
    */
  var MaxItems: PageMaxItems
  /**
    * A list that contains one TrafficPolicy element for each traffic policy version that is associated with the specified traffic policy.
    */
  var TrafficPolicies: typings.awsDashSdk.clientsRoute53Mod.TrafficPolicies
  /**
    * If IsTruncated is true, the value of TrafficPolicyVersionMarker identifies the first traffic policy that Amazon Route 53 will return if you submit another request. Call ListTrafficPolicyVersions again and specify the value of TrafficPolicyVersionMarker in the TrafficPolicyVersionMarker request parameter. This element is present only if IsTruncated is true.
    */
  var TrafficPolicyVersionMarker: typings.awsDashSdk.clientsRoute53Mod.TrafficPolicyVersionMarker
}

object ListTrafficPolicyVersionsResponse {
  @scala.inline
  def apply(
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    TrafficPolicies: TrafficPolicies,
    TrafficPolicyVersionMarker: TrafficPolicyVersionMarker
  ): ListTrafficPolicyVersionsResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated, MaxItems = MaxItems, TrafficPolicies = TrafficPolicies, TrafficPolicyVersionMarker = TrafficPolicyVersionMarker)
  
    __obj.asInstanceOf[ListTrafficPolicyVersionsResponse]
  }
}

