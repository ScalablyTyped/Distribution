package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetIpAddressTypeInput extends js.Object {
  /**
    * The IP address type. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses). Internal load balancers must use ipv4. Network Load Balancers must use ipv4.
    */
  var IpAddressType: typings.awsDashSdk.clientsElbv2Mod.IpAddressType
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsDashSdk.clientsElbv2Mod.LoadBalancerArn
}

object SetIpAddressTypeInput {
  @scala.inline
  def apply(IpAddressType: IpAddressType, LoadBalancerArn: LoadBalancerArn): SetIpAddressTypeInput = {
    val __obj = js.Dynamic.literal(IpAddressType = IpAddressType.asInstanceOf[js.Any], LoadBalancerArn = LoadBalancerArn)
  
    __obj.asInstanceOf[SetIpAddressTypeInput]
  }
}

