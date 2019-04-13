package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLoadBalancerInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: awsDashSdkLib.clientsElbv2Mod.LoadBalancerArn
}

object DeleteLoadBalancerInput {
  @scala.inline
  def apply(LoadBalancerArn: LoadBalancerArn): DeleteLoadBalancerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn)
  
    __obj.asInstanceOf[DeleteLoadBalancerInput]
  }
}

