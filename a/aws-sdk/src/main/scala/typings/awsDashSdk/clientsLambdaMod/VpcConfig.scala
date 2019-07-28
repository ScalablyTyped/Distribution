package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcConfig extends js.Object {
  /**
    * A list of VPC security groups IDs.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.SecurityGroupIds] = js.undefined
  /**
    * A list of VPC subnet IDs.
    */
  var SubnetIds: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.SubnetIds] = js.undefined
}

object VpcConfig {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds = null, SubnetIds: SubnetIds = null): VpcConfig = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    __obj.asInstanceOf[VpcConfig]
  }
}

