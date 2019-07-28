package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCompanyNetworkConfigurationResponse extends js.Object {
  /**
    * The security groups associated with access to the provided subnets.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.SecurityGroupIds] = js.undefined
  /**
    * The subnets used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var SubnetIds: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.SubnetIds] = js.undefined
  /**
    * The VPC with connectivity to associated websites.
    */
  var VpcId: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.VpcId] = js.undefined
}

object DescribeCompanyNetworkConfigurationResponse {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds = null, SubnetIds: SubnetIds = null, VpcId: VpcId = null): DescribeCompanyNetworkConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[DescribeCompanyNetworkConfigurationResponse]
  }
}

