package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTrafficPoliciesRequest extends js.Object {
  /**
    * (Optional) The maximum number of traffic policies that you want Amazon Route 53 to return in response to this request. If you have more than MaxItems traffic policies, the value of IsTruncated in the response is true, and the value of TrafficPolicyIdMarker is the ID of the first traffic policy that Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  /**
    * (Conditional) For your first request to ListTrafficPolicies, don't include the TrafficPolicyIdMarker parameter. If you have more traffic policies than the value of MaxItems, ListTrafficPolicies returns only the first MaxItems traffic policies. To get the next group of policies, submit another request to ListTrafficPolicies. For the value of TrafficPolicyIdMarker, specify the value of TrafficPolicyIdMarker that was returned in the previous response.
    */
  var TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId] = js.undefined
}

object ListTrafficPoliciesRequest {
  @scala.inline
  def apply(MaxItems: PageMaxItems = null, TrafficPolicyIdMarker: TrafficPolicyId = null): ListTrafficPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    if (TrafficPolicyIdMarker != null) __obj.updateDynamic("TrafficPolicyIdMarker")(TrafficPolicyIdMarker)
    __obj.asInstanceOf[ListTrafficPoliciesRequest]
  }
}

