package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplySecurityGroupsToLoadBalancerOutput extends js.Object {
  /**
    * The IDs of the security groups associated with the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsDashSdk.clientsElbMod.SecurityGroups] = js.undefined
}

object ApplySecurityGroupsToLoadBalancerOutput {
  @scala.inline
  def apply(SecurityGroups: SecurityGroups = null): ApplySecurityGroupsToLoadBalancerOutput = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    __obj.asInstanceOf[ApplySecurityGroupsToLoadBalancerOutput]
  }
}

