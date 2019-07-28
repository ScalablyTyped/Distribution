package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTrafficPolicyInstancesResponse extends js.Object {
  /**
    * If IsTruncated is true, HostedZoneIdMarker is the ID of the hosted zone of the first traffic policy instance that Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined
  /**
    * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get more traffic policy instances by calling ListTrafficPolicyInstances again and specifying the values of the HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker in the corresponding request parameters.
    */
  var IsTruncated: PageTruncated
  /**
    * The value that you specified for the MaxItems parameter in the call to ListTrafficPolicyInstances that produced the current response.
    */
  var MaxItems: PageMaxItems
  /**
    * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance that Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
  /**
    * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance that Amazon Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
  /**
    * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request.
    */
  var TrafficPolicyInstances: typings.awsDashSdk.clientsRoute53Mod.TrafficPolicyInstances
}

object ListTrafficPolicyInstancesResponse {
  @scala.inline
  def apply(
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    TrafficPolicyInstances: TrafficPolicyInstances,
    HostedZoneIdMarker: ResourceId = null,
    TrafficPolicyInstanceNameMarker: DNSName = null,
    TrafficPolicyInstanceTypeMarker: RRType = null
  ): ListTrafficPolicyInstancesResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated, MaxItems = MaxItems, TrafficPolicyInstances = TrafficPolicyInstances)
    if (HostedZoneIdMarker != null) __obj.updateDynamic("HostedZoneIdMarker")(HostedZoneIdMarker)
    if (TrafficPolicyInstanceNameMarker != null) __obj.updateDynamic("TrafficPolicyInstanceNameMarker")(TrafficPolicyInstanceNameMarker)
    if (TrafficPolicyInstanceTypeMarker != null) __obj.updateDynamic("TrafficPolicyInstanceTypeMarker")(TrafficPolicyInstanceTypeMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesResponse]
  }
}

