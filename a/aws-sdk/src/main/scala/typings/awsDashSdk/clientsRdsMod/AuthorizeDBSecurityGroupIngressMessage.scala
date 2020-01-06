package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeDBSecurityGroupIngressMessage extends js.Object {
  /**
    * The IP range to authorize.
    */
  var CIDRIP: js.UndefOr[String] = js.native
  /**
    * The name of the DB security group to add authorization to.
    */
  var DBSecurityGroupName: String = js.native
  /**
    *  Id of the EC2 security group to authorize. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
    */
  var EC2SecurityGroupId: js.UndefOr[String] = js.native
  /**
    *  Name of the EC2 security group to authorize. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  /**
    *  AWS account number of the owner of the EC2 security group specified in the EC2SecurityGroupName parameter. The AWS access key ID isn't an acceptable value. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided. 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
}

object AuthorizeDBSecurityGroupIngressMessage {
  @scala.inline
  def apply(
    DBSecurityGroupName: String,
    CIDRIP: String = null,
    EC2SecurityGroupId: String = null,
    EC2SecurityGroupName: String = null,
    EC2SecurityGroupOwnerId: String = null
  ): AuthorizeDBSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(DBSecurityGroupName = DBSecurityGroupName.asInstanceOf[js.Any])
    if (CIDRIP != null) __obj.updateDynamic("CIDRIP")(CIDRIP.asInstanceOf[js.Any])
    if (EC2SecurityGroupId != null) __obj.updateDynamic("EC2SecurityGroupId")(EC2SecurityGroupId.asInstanceOf[js.Any])
    if (EC2SecurityGroupName != null) __obj.updateDynamic("EC2SecurityGroupName")(EC2SecurityGroupName.asInstanceOf[js.Any])
    if (EC2SecurityGroupOwnerId != null) __obj.updateDynamic("EC2SecurityGroupOwnerId")(EC2SecurityGroupOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeDBSecurityGroupIngressMessage]
  }
}

