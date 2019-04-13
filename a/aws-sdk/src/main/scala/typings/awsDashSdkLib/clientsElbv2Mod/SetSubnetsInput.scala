package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSubnetsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: awsDashSdkLib.clientsElbv2Mod.LoadBalancerArn
  /**
    * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. You cannot specify Elastic IP addresses for your subnets.
    */
  var SubnetMappings: js.UndefOr[SubnetMappings] = js.undefined
  /**
    * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
    */
  var Subnets: js.UndefOr[Subnets] = js.undefined
}

object SetSubnetsInput {
  @scala.inline
  def apply(LoadBalancerArn: LoadBalancerArn, SubnetMappings: SubnetMappings = null, Subnets: Subnets = null): SetSubnetsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn)
    if (SubnetMappings != null) __obj.updateDynamic("SubnetMappings")(SubnetMappings)
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets)
    __obj.asInstanceOf[SetSubnetsInput]
  }
}

