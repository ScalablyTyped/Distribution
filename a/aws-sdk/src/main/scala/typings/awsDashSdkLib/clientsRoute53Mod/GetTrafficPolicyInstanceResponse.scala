package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTrafficPolicyInstanceResponse extends js.Object {
  /**
    * A complex type that contains settings for the traffic policy instance.
    */
  var TrafficPolicyInstance: awsDashSdkLib.clientsRoute53Mod.TrafficPolicyInstance
}

object GetTrafficPolicyInstanceResponse {
  @scala.inline
  def apply(TrafficPolicyInstance: TrafficPolicyInstance): GetTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstance = TrafficPolicyInstance)
  
    __obj.asInstanceOf[GetTrafficPolicyInstanceResponse]
  }
}

