package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeClusterSecurityGroupIngressMessage extends js.Object {
  /**
    * The IP range for which to revoke access. This range must be a valid Classless Inter-Domain Routing (CIDR) block of IP addresses. If CIDRIP is specified, EC2SecurityGroupName and EC2SecurityGroupOwnerId cannot be provided. 
    */
  var CIDRIP: js.UndefOr[String] = js.undefined
  /**
    * The name of the security Group from which to revoke the ingress rule.
    */
  var ClusterSecurityGroupName: String
  /**
    * The name of the EC2 Security Group whose access is to be revoked. If EC2SecurityGroupName is specified, EC2SecurityGroupOwnerId must also be provided and CIDRIP cannot be provided. 
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * The AWS account number of the owner of the security group specified in the EC2SecurityGroupName parameter. The AWS access key ID is not an acceptable value. If EC2SecurityGroupOwnerId is specified, EC2SecurityGroupName must also be provided. and CIDRIP cannot be provided.  Example: 111122223333 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
}

object RevokeClusterSecurityGroupIngressMessage {
  @scala.inline
  def apply(
    ClusterSecurityGroupName: String,
    CIDRIP: String = null,
    EC2SecurityGroupName: String = null,
    EC2SecurityGroupOwnerId: String = null
  ): RevokeClusterSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName)
    if (CIDRIP != null) __obj.updateDynamic("CIDRIP")(CIDRIP)
    if (EC2SecurityGroupName != null) __obj.updateDynamic("EC2SecurityGroupName")(EC2SecurityGroupName)
    if (EC2SecurityGroupOwnerId != null) __obj.updateDynamic("EC2SecurityGroupOwnerId")(EC2SecurityGroupOwnerId)
    __obj.asInstanceOf[RevokeClusterSecurityGroupIngressMessage]
  }
}

