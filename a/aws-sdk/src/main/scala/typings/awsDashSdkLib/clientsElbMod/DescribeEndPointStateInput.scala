package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndPointStateInput extends js.Object {
  /**
    * The IDs of the instances.
    */
  var Instances: js.UndefOr[Instances] = js.undefined
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}

object DescribeEndPointStateInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, Instances: Instances = null): DescribeEndPointStateInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName)
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    __obj.asInstanceOf[DescribeEndPointStateInput]
  }
}

