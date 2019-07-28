package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTrafficPolicyRequest extends js.Object {
  /**
    * The ID of the traffic policy that you want to delete.
    */
  var Id: TrafficPolicyId
  /**
    * The version number of the traffic policy that you want to delete.
    */
  var Version: TrafficPolicyVersion
}

object DeleteTrafficPolicyRequest {
  @scala.inline
  def apply(Id: TrafficPolicyId, Version: TrafficPolicyVersion): DeleteTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id, Version = Version)
  
    __obj.asInstanceOf[DeleteTrafficPolicyRequest]
  }
}

