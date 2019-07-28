package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCompanyNetworkConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
  /**
    * The security groups associated with access to the provided subnets.
    */
  var SecurityGroupIds: typings.awsDashSdk.clientsWorklinkMod.SecurityGroupIds
  /**
    * The subnets used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var SubnetIds: typings.awsDashSdk.clientsWorklinkMod.SubnetIds
  /**
    * The VPC with connectivity to associated websites.
    */
  var VpcId: typings.awsDashSdk.clientsWorklinkMod.VpcId
}

object UpdateCompanyNetworkConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds, VpcId: VpcId): UpdateCompanyNetworkConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn, SecurityGroupIds = SecurityGroupIds, SubnetIds = SubnetIds, VpcId = VpcId)
  
    __obj.asInstanceOf[UpdateCompanyNetworkConfigurationRequest]
  }
}

