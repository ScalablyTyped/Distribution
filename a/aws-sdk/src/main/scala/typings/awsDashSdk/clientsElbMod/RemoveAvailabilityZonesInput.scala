package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAvailabilityZonesInput extends js.Object {
  /**
    * The Availability Zones.
    */
  var AvailabilityZones: typings.awsDashSdk.clientsElbMod.AvailabilityZones
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}

object RemoveAvailabilityZonesInput {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZones, LoadBalancerName: AccessPointName): RemoveAvailabilityZonesInput = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones, LoadBalancerName = LoadBalancerName)
  
    __obj.asInstanceOf[RemoveAvailabilityZonesInput]
  }
}

