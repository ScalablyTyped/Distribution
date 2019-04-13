package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTrafficPolicyCommentResponse extends js.Object {
  /**
    * A complex type that contains settings for the specified traffic policy.
    */
  var TrafficPolicy: awsDashSdkLib.clientsRoute53Mod.TrafficPolicy
}

object UpdateTrafficPolicyCommentResponse {
  @scala.inline
  def apply(TrafficPolicy: TrafficPolicy): UpdateTrafficPolicyCommentResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicy = TrafficPolicy)
  
    __obj.asInstanceOf[UpdateTrafficPolicyCommentResponse]
  }
}

