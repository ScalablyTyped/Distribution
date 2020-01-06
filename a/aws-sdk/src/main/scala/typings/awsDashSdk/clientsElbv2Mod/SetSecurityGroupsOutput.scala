package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSecurityGroupsOutput extends js.Object {
  /**
    * The IDs of the security groups associated with the load balancer.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroups] = js.native
}

object SetSecurityGroupsOutput {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroups = null): SetSecurityGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSecurityGroupsOutput]
  }
}

