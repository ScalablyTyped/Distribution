package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrafficPolicyInstanceResponse extends js.Object {
  /**
    * A unique URL that represents a new traffic policy instance.
    */
  var Location: ResourceURI
  /**
    * A complex type that contains settings for the new traffic policy instance.
    */
  var TrafficPolicyInstance: typings.awsDashSdk.clientsRoute53Mod.TrafficPolicyInstance
}

object CreateTrafficPolicyInstanceResponse {
  @scala.inline
  def apply(Location: ResourceURI, TrafficPolicyInstance: TrafficPolicyInstance): CreateTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(Location = Location, TrafficPolicyInstance = TrafficPolicyInstance)
  
    __obj.asInstanceOf[CreateTrafficPolicyInstanceResponse]
  }
}

