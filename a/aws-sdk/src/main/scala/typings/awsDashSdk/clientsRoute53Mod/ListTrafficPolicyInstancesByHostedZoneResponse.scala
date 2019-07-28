package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTrafficPolicyInstancesByHostedZoneResponse extends js.Object {
  /**
    * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get the next group of traffic policy instances by submitting another ListTrafficPolicyInstancesByHostedZone request and specifying the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker in the corresponding request parameters.
    */
  var IsTruncated: PageTruncated
  /**
    * The value that you specified for the MaxItems parameter in the ListTrafficPolicyInstancesByHostedZone request that produced the current response.
    */
  var MaxItems: PageMaxItems
  /**
    * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance in the next group of traffic policy instances.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
  /**
    * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance in the next group of traffic policy instances.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
  /**
    * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request. 
    */
  var TrafficPolicyInstances: typings.awsDashSdk.clientsRoute53Mod.TrafficPolicyInstances
}

object ListTrafficPolicyInstancesByHostedZoneResponse {
  @scala.inline
  def apply(
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    TrafficPolicyInstances: TrafficPolicyInstances,
    TrafficPolicyInstanceNameMarker: DNSName = null,
    TrafficPolicyInstanceTypeMarker: RRType = null
  ): ListTrafficPolicyInstancesByHostedZoneResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated, MaxItems = MaxItems, TrafficPolicyInstances = TrafficPolicyInstances)
    if (TrafficPolicyInstanceNameMarker != null) __obj.updateDynamic("TrafficPolicyInstanceNameMarker")(TrafficPolicyInstanceNameMarker)
    if (TrafficPolicyInstanceTypeMarker != null) __obj.updateDynamic("TrafficPolicyInstanceTypeMarker")(TrafficPolicyInstanceTypeMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesByHostedZoneResponse]
  }
}

