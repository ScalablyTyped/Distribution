package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcConfigResponse extends js.Object {
  /**
    * A list of VPC security groups IDs.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.SecurityGroupIds] = js.undefined
  /**
    * A list of VPC subnet IDs.
    */
  var SubnetIds: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.SubnetIds] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.VpcId] = js.undefined
}

object VpcConfigResponse {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds = null, SubnetIds: SubnetIds = null, VpcId: VpcId = null): VpcConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[VpcConfigResponse]
  }
}

