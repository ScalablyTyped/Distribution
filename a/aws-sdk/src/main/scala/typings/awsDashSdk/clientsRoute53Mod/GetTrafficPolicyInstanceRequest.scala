package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTrafficPolicyInstanceRequest extends js.Object {
  /**
    * The ID of the traffic policy instance that you want to get information about.
    */
  var Id: TrafficPolicyInstanceId
}

object GetTrafficPolicyInstanceRequest {
  @scala.inline
  def apply(Id: TrafficPolicyInstanceId): GetTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetTrafficPolicyInstanceRequest]
  }
}

