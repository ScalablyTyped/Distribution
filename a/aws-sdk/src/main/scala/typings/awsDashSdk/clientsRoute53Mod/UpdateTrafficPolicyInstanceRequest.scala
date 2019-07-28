package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTrafficPolicyInstanceRequest extends js.Object {
  /**
    * The ID of the traffic policy instance that you want to update.
    */
  var Id: TrafficPolicyInstanceId
  /**
    * The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
    */
  var TTL: typings.awsDashSdk.clientsRoute53Mod.TTL
  /**
    * The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the specified traffic policy instance.
    */
  var TrafficPolicyId: typings.awsDashSdk.clientsRoute53Mod.TrafficPolicyId
  /**
    * The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the specified traffic policy instance.
    */
  var TrafficPolicyVersion: typings.awsDashSdk.clientsRoute53Mod.TrafficPolicyVersion
}

object UpdateTrafficPolicyInstanceRequest {
  @scala.inline
  def apply(
    Id: TrafficPolicyInstanceId,
    TTL: TTL,
    TrafficPolicyId: TrafficPolicyId,
    TrafficPolicyVersion: TrafficPolicyVersion
  ): UpdateTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id, TTL = TTL, TrafficPolicyId = TrafficPolicyId, TrafficPolicyVersion = TrafficPolicyVersion)
  
    __obj.asInstanceOf[UpdateTrafficPolicyInstanceRequest]
  }
}

