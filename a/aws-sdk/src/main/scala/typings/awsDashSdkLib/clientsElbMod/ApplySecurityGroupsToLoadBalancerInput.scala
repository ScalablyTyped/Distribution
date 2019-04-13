package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplySecurityGroupsToLoadBalancerInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  /**
    * The IDs of the security groups to associate with the load balancer. Note that you cannot specify the name of the security group.
    */
  var SecurityGroups: awsDashSdkLib.clientsElbMod.SecurityGroups
}

object ApplySecurityGroupsToLoadBalancerInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, SecurityGroups: SecurityGroups): ApplySecurityGroupsToLoadBalancerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName, SecurityGroups = SecurityGroups)
  
    __obj.asInstanceOf[ApplySecurityGroupsToLoadBalancerInput]
  }
}

