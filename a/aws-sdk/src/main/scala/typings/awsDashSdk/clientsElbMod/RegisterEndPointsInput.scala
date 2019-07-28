package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterEndPointsInput extends js.Object {
  /**
    * The IDs of the instances.
    */
  var Instances: typings.awsDashSdk.clientsElbMod.Instances
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}

object RegisterEndPointsInput {
  @scala.inline
  def apply(Instances: Instances, LoadBalancerName: AccessPointName): RegisterEndPointsInput = {
    val __obj = js.Dynamic.literal(Instances = Instances, LoadBalancerName = LoadBalancerName)
  
    __obj.asInstanceOf[RegisterEndPointsInput]
  }
}

