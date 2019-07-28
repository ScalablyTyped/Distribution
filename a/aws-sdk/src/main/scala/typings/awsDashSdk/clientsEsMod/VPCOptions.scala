package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPCOptions extends js.Object {
  /**
    * Specifies the security groups for VPC endpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
  /**
    * Specifies the subnets for VPC endpoint.
    */
  var SubnetIds: js.UndefOr[StringList] = js.undefined
}

object VPCOptions {
  @scala.inline
  def apply(SecurityGroupIds: StringList = null, SubnetIds: StringList = null): VPCOptions = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    __obj.asInstanceOf[VPCOptions]
  }
}

