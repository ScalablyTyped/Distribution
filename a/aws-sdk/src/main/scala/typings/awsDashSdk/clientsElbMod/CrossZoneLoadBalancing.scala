package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossZoneLoadBalancing extends js.Object {
  /**
    * Specifies whether cross-zone load balancing is enabled for the load balancer.
    */
  var Enabled: CrossZoneLoadBalancingEnabled
}

object CrossZoneLoadBalancing {
  @scala.inline
  def apply(Enabled: CrossZoneLoadBalancingEnabled): CrossZoneLoadBalancing = {
    val __obj = js.Dynamic.literal(Enabled = Enabled)
  
    __obj.asInstanceOf[CrossZoneLoadBalancing]
  }
}

