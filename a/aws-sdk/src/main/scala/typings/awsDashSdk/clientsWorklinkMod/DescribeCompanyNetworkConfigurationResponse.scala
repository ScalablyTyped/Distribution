package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCompanyNetworkConfigurationResponse extends js.Object {
  /**
    * The security groups associated with access to the provided subnets.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.SecurityGroupIds] = js.native
  /**
    * The subnets used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var SubnetIds: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.SubnetIds] = js.native
  /**
    * The VPC with connectivity to associated websites.
    */
  var VpcId: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.VpcId] = js.native
}

object DescribeCompanyNetworkConfigurationResponse {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds = null, SubnetIds: SubnetIds = null, VpcId: VpcId = null): DescribeCompanyNetworkConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCompanyNetworkConfigurationResponse]
  }
}

