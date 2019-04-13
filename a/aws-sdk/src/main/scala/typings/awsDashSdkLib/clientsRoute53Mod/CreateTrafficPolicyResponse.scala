package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrafficPolicyResponse extends js.Object {
  /**
    * A unique URL that represents a new traffic policy.
    */
  var Location: ResourceURI
  /**
    * A complex type that contains settings for the new traffic policy.
    */
  var TrafficPolicy: awsDashSdkLib.clientsRoute53Mod.TrafficPolicy
}

object CreateTrafficPolicyResponse {
  @scala.inline
  def apply(Location: ResourceURI, TrafficPolicy: TrafficPolicy): CreateTrafficPolicyResponse = {
    val __obj = js.Dynamic.literal(Location = Location, TrafficPolicy = TrafficPolicy)
  
    __obj.asInstanceOf[CreateTrafficPolicyResponse]
  }
}

