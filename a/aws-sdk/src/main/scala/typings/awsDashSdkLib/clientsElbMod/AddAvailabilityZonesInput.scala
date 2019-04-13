package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAvailabilityZonesInput extends js.Object {
  /**
    * The Availability Zones. These must be in the same region as the load balancer.
    */
  var AvailabilityZones: awsDashSdkLib.clientsElbMod.AvailabilityZones
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}

object AddAvailabilityZonesInput {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZones, LoadBalancerName: AccessPointName): AddAvailabilityZonesInput = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones, LoadBalancerName = LoadBalancerName)
  
    __obj.asInstanceOf[AddAvailabilityZonesInput]
  }
}

