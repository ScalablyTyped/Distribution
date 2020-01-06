package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrafficPolicyRequest extends js.Object {
  /**
    * The ID of the traffic policy that you want to get information about.
    */
  var Id: TrafficPolicyId = js.native
  /**
    * The version number of the traffic policy that you want to get information about.
    */
  var Version: TrafficPolicyVersion = js.native
}

object GetTrafficPolicyRequest {
  @scala.inline
  def apply(Id: TrafficPolicyId, Version: TrafficPolicyVersion): GetTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTrafficPolicyRequest]
  }
}

