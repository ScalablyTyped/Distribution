package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcConfig extends js.Object {
  /**
    * The identifiers of the security groups for the fleet or image builder.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
  /**
    * The identifiers of the subnets to which a network interface is attached from the fleet instance or image builder instance. Fleet instances use one or more subnets. Image builder instances use one subnet.
    */
  var SubnetIds: js.UndefOr[SubnetIdList] = js.undefined
}

object VpcConfig {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIdList = null, SubnetIds: SubnetIdList = null): VpcConfig = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    __obj.asInstanceOf[VpcConfig]
  }
}

