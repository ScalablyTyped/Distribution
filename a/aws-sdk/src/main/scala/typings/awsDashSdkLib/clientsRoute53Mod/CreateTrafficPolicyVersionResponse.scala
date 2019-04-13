package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrafficPolicyVersionResponse extends js.Object {
  /**
    * A unique URL that represents a new traffic policy version.
    */
  var Location: ResourceURI
  /**
    * A complex type that contains settings for the new version of the traffic policy.
    */
  var TrafficPolicy: awsDashSdkLib.clientsRoute53Mod.TrafficPolicy
}

object CreateTrafficPolicyVersionResponse {
  @scala.inline
  def apply(Location: ResourceURI, TrafficPolicy: TrafficPolicy): CreateTrafficPolicyVersionResponse = {
    val __obj = js.Dynamic.literal(Location = Location, TrafficPolicy = TrafficPolicy)
  
    __obj.asInstanceOf[CreateTrafficPolicyVersionResponse]
  }
}

