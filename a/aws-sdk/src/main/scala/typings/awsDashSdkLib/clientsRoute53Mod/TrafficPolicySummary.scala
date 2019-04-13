package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficPolicySummary extends js.Object {
  /**
    * The ID that Amazon Route 53 assigned to the traffic policy when you created it.
    */
  var Id: TrafficPolicyId
  /**
    * The version number of the latest version of the traffic policy.
    */
  var LatestVersion: TrafficPolicyVersion
  /**
    * The name that you specified for the traffic policy when you created it.
    */
  var Name: TrafficPolicyName
  /**
    * The number of traffic policies that are associated with the current AWS account.
    */
  var TrafficPolicyCount: TrafficPolicyVersion
  /**
    * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
    */
  var Type: RRType
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
    val __obj = js.Dynamic.literal(Id = Id, LatestVersion = LatestVersion, Name = Name, TrafficPolicyCount = TrafficPolicyCount, Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrafficPolicySummary]
  }
}

