package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2SecurityGroup extends js.Object {
  /**
    * Specifies the id of the EC2 security group.
    */
  var EC2SecurityGroupId: js.UndefOr[String] = js.undefined
  /**
    * Specifies the name of the EC2 security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    *  Specifies the AWS ID of the owner of the EC2 security group specified in the EC2SecurityGroupName field. 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  /**
    * Provides the status of the EC2 security group. Status can be "authorizing", "authorized", "revoking", and "revoked".
    */
  var Status: js.UndefOr[String] = js.undefined
}

object EC2SecurityGroup {
  @scala.inline
  def apply(
    EC2SecurityGroupId: String = null,
    EC2SecurityGroupName: String = null,
    EC2SecurityGroupOwnerId: String = null,
    Status: String = null
  ): EC2SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (EC2SecurityGroupId != null) __obj.updateDynamic("EC2SecurityGroupId")(EC2SecurityGroupId)
    if (EC2SecurityGroupName != null) __obj.updateDynamic("EC2SecurityGroupName")(EC2SecurityGroupName)
    if (EC2SecurityGroupOwnerId != null) __obj.updateDynamic("EC2SecurityGroupOwnerId")(EC2SecurityGroupOwnerId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[EC2SecurityGroup]
  }
}

