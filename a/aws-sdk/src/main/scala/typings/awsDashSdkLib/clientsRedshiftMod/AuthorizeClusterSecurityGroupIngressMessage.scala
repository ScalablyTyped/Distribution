package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeClusterSecurityGroupIngressMessage extends js.Object {
  /**
    * The IP range to be added the Amazon Redshift security group.
    */
  var CIDRIP: js.UndefOr[String] = js.undefined
  /**
    * The name of the security group to which the ingress rule is added.
    */
  var ClusterSecurityGroupName: String
  /**
    * The EC2 security group to be added the Amazon Redshift security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * The AWS account number of the owner of the security group specified by the EC2SecurityGroupName parameter. The AWS Access Key ID is not an acceptable value.  Example: 111122223333 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
}

object AuthorizeClusterSecurityGroupIngressMessage {
  @scala.inline
  def apply(
    ClusterSecurityGroupName: String,
    CIDRIP: String = null,
    EC2SecurityGroupName: String = null,
    EC2SecurityGroupOwnerId: String = null
  ): AuthorizeClusterSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName)
    if (CIDRIP != null) __obj.updateDynamic("CIDRIP")(CIDRIP)
    if (EC2SecurityGroupName != null) __obj.updateDynamic("EC2SecurityGroupName")(EC2SecurityGroupName)
    if (EC2SecurityGroupOwnerId != null) __obj.updateDynamic("EC2SecurityGroupOwnerId")(EC2SecurityGroupOwnerId)
    __obj.asInstanceOf[AuthorizeClusterSecurityGroupIngressMessage]
  }
}

