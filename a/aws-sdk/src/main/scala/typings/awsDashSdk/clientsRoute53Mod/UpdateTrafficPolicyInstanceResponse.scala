package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrafficPolicyInstanceResponse extends js.Object {
  /**
    * A complex type that contains settings for the updated traffic policy instance.
    */
  var TrafficPolicyInstance: typings.awsDashSdk.clientsRoute53Mod.TrafficPolicyInstance = js.native
}

object UpdateTrafficPolicyInstanceResponse {
  @scala.inline
  def apply(TrafficPolicyInstance: TrafficPolicyInstance): UpdateTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstance = TrafficPolicyInstance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateTrafficPolicyInstanceResponse]
  }
}

