package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCompanyNetworkConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn = js.native
  /**
    * The security groups associated with access to the provided subnets.
    */
  var SecurityGroupIds: typings.awsDashSdk.clientsWorklinkMod.SecurityGroupIds = js.native
  /**
    * The subnets used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var SubnetIds: typings.awsDashSdk.clientsWorklinkMod.SubnetIds = js.native
  /**
    * The VPC with connectivity to associated websites.
    */
  var VpcId: typings.awsDashSdk.clientsWorklinkMod.VpcId = js.native
}

object UpdateCompanyNetworkConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds, VpcId: VpcId): UpdateCompanyNetworkConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateCompanyNetworkConfigurationRequest]
  }
}

