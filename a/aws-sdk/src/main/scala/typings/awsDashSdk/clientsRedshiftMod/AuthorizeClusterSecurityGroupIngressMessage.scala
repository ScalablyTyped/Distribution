package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeClusterSecurityGroupIngressMessage extends js.Object {
  /**
    * The IP range to be added the Amazon Redshift security group.
    */
  var CIDRIP: js.UndefOr[String] = js.native
  /**
    * The name of the security group to which the ingress rule is added.
    */
  var ClusterSecurityGroupName: String = js.native
  /**
    * The EC2 security group to be added the Amazon Redshift security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The AWS account number of the owner of the security group specified by the EC2SecurityGroupName parameter. The AWS Access Key ID is not an acceptable value.  Example: 111122223333 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
}

object AuthorizeClusterSecurityGroupIngressMessage {
  @scala.inline
  def apply(
    ClusterSecurityGroupName: String,
    CIDRIP: String = null,
    EC2SecurityGroupName: String = null,
    EC2SecurityGroupOwnerId: String = null
  ): AuthorizeClusterSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any])
    if (CIDRIP != null) __obj.updateDynamic("CIDRIP")(CIDRIP.asInstanceOf[js.Any])
    if (EC2SecurityGroupName != null) __obj.updateDynamic("EC2SecurityGroupName")(EC2SecurityGroupName.asInstanceOf[js.Any])
    if (EC2SecurityGroupOwnerId != null) __obj.updateDynamic("EC2SecurityGroupOwnerId")(EC2SecurityGroupOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeClusterSecurityGroupIngressMessage]
  }
}

