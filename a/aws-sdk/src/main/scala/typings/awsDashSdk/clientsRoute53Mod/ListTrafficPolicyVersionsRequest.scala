package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTrafficPolicyVersionsRequest extends js.Object {
  /**
    * Specify the value of Id of the traffic policy for which you want to list all versions.
    */
  var Id: TrafficPolicyId
  /**
    * The maximum number of traffic policy versions that you want Amazon Route 53 to include in the response body for this request. If the specified traffic policy has more than MaxItems versions, the value of IsTruncated in the response is true, and the value of the TrafficPolicyVersionMarker element is the ID of the first version that Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  /**
    * For your first request to ListTrafficPolicyVersions, don't include the TrafficPolicyVersionMarker parameter. If you have more traffic policy versions than the value of MaxItems, ListTrafficPolicyVersions returns only the first group of MaxItems versions. To get more traffic policy versions, submit another ListTrafficPolicyVersions request. For the value of TrafficPolicyVersionMarker, specify the value of TrafficPolicyVersionMarker in the previous response.
    */
  var TrafficPolicyVersionMarker: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.TrafficPolicyVersionMarker] = js.undefined
}

object ListTrafficPolicyVersionsRequest {
  @scala.inline
  def apply(
    Id: TrafficPolicyId,
    MaxItems: PageMaxItems = null,
    TrafficPolicyVersionMarker: TrafficPolicyVersionMarker = null
  ): ListTrafficPolicyVersionsRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    if (TrafficPolicyVersionMarker != null) __obj.updateDynamic("TrafficPolicyVersionMarker")(TrafficPolicyVersionMarker)
    __obj.asInstanceOf[ListTrafficPolicyVersionsRequest]
  }
}

