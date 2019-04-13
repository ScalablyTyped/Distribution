package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroup extends js.Object {
  /**
    * A description of the security group.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  /**
    * One or more inbound rules associated with the security group.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.undefined
  /**
    * [EC2-VPC] One or more outbound rules associated with the security group.
    */
  var IpPermissionsEgress: js.UndefOr[IpPermissionList] = js.undefined
  /**
    * The AWS account ID of the owner of the security group.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the security group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * [EC2-VPC] The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object SecurityGroup {
  @scala.inline
  def apply(
    Description: String = null,
    GroupId: String = null,
    GroupName: String = null,
    IpPermissions: IpPermissionList = null,
    IpPermissionsEgress: IpPermissionList = null,
    OwnerId: String = null,
    Tags: TagList = null,
    VpcId: String = null
  ): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (IpPermissions != null) __obj.updateDynamic("IpPermissions")(IpPermissions)
    if (IpPermissionsEgress != null) __obj.updateDynamic("IpPermissionsEgress")(IpPermissionsEgress)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[SecurityGroup]
  }
}

