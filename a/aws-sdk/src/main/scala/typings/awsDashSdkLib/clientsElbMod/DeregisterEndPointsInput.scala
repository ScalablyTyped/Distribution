package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterEndPointsInput extends js.Object {
  /**
    * The IDs of the instances.
    */
  var Instances: awsDashSdkLib.clientsElbMod.Instances
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}

object DeregisterEndPointsInput {
  @scala.inline
  def apply(Instances: Instances, LoadBalancerName: AccessPointName): DeregisterEndPointsInput = {
    val __obj = js.Dynamic.literal(Instances = Instances, LoadBalancerName = LoadBalancerName)
  
    __obj.asInstanceOf[DeregisterEndPointsInput]
  }
}

