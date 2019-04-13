package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachInstancesFromLoadBalancerRequest extends js.Object {
  /**
    * An array of strings containing the names of the instances you want to detach from the load balancer.
    */
  var instanceNames: ResourceNameList
  /**
    * The name of the Lightsail load balancer.
    */
  var loadBalancerName: ResourceName
}

object DetachInstancesFromLoadBalancerRequest {
  @scala.inline
  def apply(instanceNames: ResourceNameList, loadBalancerName: ResourceName): DetachInstancesFromLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames, loadBalancerName = loadBalancerName)
  
    __obj.asInstanceOf[DetachInstancesFromLoadBalancerRequest]
  }
}

