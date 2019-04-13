package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCompanyNetworkConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: awsDashSdkLib.clientsWorklinkMod.FleetArn
  /**
    * The security groups associated with access to the provided subnets.
    */
  var SecurityGroupIds: awsDashSdkLib.clientsWorklinkMod.SecurityGroupIds
  /**
    * The subnets used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var SubnetIds: awsDashSdkLib.clientsWorklinkMod.SubnetIds
  /**
    * The VPC with connectivity to associated websites.
    */
  var VpcId: awsDashSdkLib.clientsWorklinkMod.VpcId
}

object UpdateCompanyNetworkConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds, VpcId: VpcId): UpdateCompanyNetworkConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn, SecurityGroupIds = SecurityGroupIds, SubnetIds = SubnetIds, VpcId = VpcId)
  
    __obj.asInstanceOf[UpdateCompanyNetworkConfigurationRequest]
  }
}

