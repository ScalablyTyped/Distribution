package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTrafficPolicyInstanceResponse extends js.Object {
  /**
    * A complex type that contains settings for the updated traffic policy instance.
    */
  var TrafficPolicyInstance: typings.awsDashSdk.clientsRoute53Mod.TrafficPolicyInstance
}

object UpdateTrafficPolicyInstanceResponse {
  @scala.inline
  def apply(TrafficPolicyInstance: TrafficPolicyInstance): UpdateTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstance = TrafficPolicyInstance)
  
    __obj.asInstanceOf[UpdateTrafficPolicyInstanceResponse]
  }
}

