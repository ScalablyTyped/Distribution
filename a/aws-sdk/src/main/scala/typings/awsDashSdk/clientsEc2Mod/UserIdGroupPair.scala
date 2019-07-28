package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdGroupPair extends js.Object {
  /**
    * A description for the security group rule that references this user ID group pair. Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  /**
    * The name of the security group. In a request, use this parameter for a security group in EC2-Classic or a default VPC only. For a security group in a nondefault VPC, use the security group ID.  For a referenced security group in another VPC, this value is not returned if the referenced security group is deleted.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  /**
    * The status of a VPC peering connection, if applicable.
    */
  var PeeringStatus: js.UndefOr[String] = js.undefined
  /**
    * The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced security group is returned in the response. If the referenced security group is deleted, this value is not returned. [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS account.
    */
  var UserId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPC for the referenced security group, if applicable.
    */
  var VpcId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPC peering connection, if applicable.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
}

object UserIdGroupPair {
  @scala.inline
  def apply(
    Description: String = null,
    GroupId: String = null,
    GroupName: String = null,
    PeeringStatus: String = null,
    UserId: String = null,
    VpcId: String = null,
    VpcPeeringConnectionId: String = null
  ): UserIdGroupPair = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (PeeringStatus != null) __obj.updateDynamic("PeeringStatus")(PeeringStatus)
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    if (VpcPeeringConnectionId != null) __obj.updateDynamic("VpcPeeringConnectionId")(VpcPeeringConnectionId)
    __obj.asInstanceOf[UserIdGroupPair]
  }
}

