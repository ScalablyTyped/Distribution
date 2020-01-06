package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficPolicySummary extends js.Object {
  /**
    * The ID that Amazon Route 53 assigned to the traffic policy when you created it.
    */
  var Id: TrafficPolicyId = js.native
  /**
    * The version number of the latest version of the traffic policy.
    */
  var LatestVersion: TrafficPolicyVersion = js.native
  /**
    * The name that you specified for the traffic policy when you created it.
    */
  var Name: TrafficPolicyName = js.native
  /**
    * The number of traffic policies that are associated with the current AWS account.
    */
  var TrafficPolicyCount: TrafficPolicyVersion = js.native
  /**
    * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
    */
  var Type: RRType = js.native
}

object TrafficPolicySummary {
  @scala.inline
  def apply(
    Id: TrafficPolicyId,
    LatestVersion: TrafficPolicyVersion,
    Name: TrafficPolicyName,
    TrafficPolicyCount: TrafficPolicyVersion,
    Type: RRType
  ): TrafficPolicySummary = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LatestVersion = LatestVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TrafficPolicyCount = TrafficPolicyCount.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrafficPolicySummary]
  }
}

