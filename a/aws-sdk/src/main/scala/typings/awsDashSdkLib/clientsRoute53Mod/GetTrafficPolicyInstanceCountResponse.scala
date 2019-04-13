package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTrafficPolicyInstanceCountResponse extends js.Object {
  /**
    * The number of traffic policy instances that are associated with the current AWS account.
    */
  var TrafficPolicyInstanceCount: awsDashSdkLib.clientsRoute53Mod.TrafficPolicyInstanceCount
}

object GetTrafficPolicyInstanceCountResponse {
  @scala.inline
  def apply(TrafficPolicyInstanceCount: TrafficPolicyInstanceCount): GetTrafficPolicyInstanceCountResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstanceCount = TrafficPolicyInstanceCount)
  
    __obj.asInstanceOf[GetTrafficPolicyInstanceCountResponse]
  }
}

