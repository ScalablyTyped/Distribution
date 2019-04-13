package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTrafficPolicyRequest extends js.Object {
  /**
    * The ID of the traffic policy that you want to get information about.
    */
  var Id: TrafficPolicyId
  /**
    * The version number of the traffic policy that you want to get information about.
    */
  var Version: TrafficPolicyVersion
}

object GetTrafficPolicyRequest {
  @scala.inline
  def apply(Id: TrafficPolicyId, Version: TrafficPolicyVersion): GetTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id, Version = Version)
  
    __obj.asInstanceOf[GetTrafficPolicyRequest]
  }
}

