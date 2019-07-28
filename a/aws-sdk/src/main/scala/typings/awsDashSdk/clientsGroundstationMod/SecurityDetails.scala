package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityDetails extends js.Object {
  /**
    * ARN to a role needed for connecting streams to your instances. 
    */
  var roleArn: RoleArn
  /**
    * The security groups to attach to the elastic network interfaces.
    */
  var securityGroupIds: SecurityGroupIdList
  /**
    * A list of subnets where AWS Ground Station places elastic network interfaces to send streams to your instances.
    */
  var subnetIds: SubnetList
}

object SecurityDetails {
  @scala.inline
  def apply(roleArn: RoleArn, securityGroupIds: SecurityGroupIdList, subnetIds: SubnetList): SecurityDetails = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, securityGroupIds = securityGroupIds, subnetIds = subnetIds)
  
    __obj.asInstanceOf[SecurityDetails]
  }
}

