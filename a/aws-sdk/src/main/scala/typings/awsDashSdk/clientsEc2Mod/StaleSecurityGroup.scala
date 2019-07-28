package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaleSecurityGroup extends js.Object {
  /**
    * The description of the security group.
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
    * Information about the stale inbound rules in the security group.
    */
  var StaleIpPermissions: js.UndefOr[StaleIpPermissionSet] = js.undefined
  /**
    * Information about the stale outbound rules in the security group.
    */
  var StaleIpPermissionsEgress: js.UndefOr[StaleIpPermissionSet] = js.undefined
  /**
    * The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object StaleSecurityGroup {
  @scala.inline
  def apply(
    Description: String = null,
    GroupId: String = null,
    GroupName: String = null,
    StaleIpPermissions: StaleIpPermissionSet = null,
    StaleIpPermissionsEgress: StaleIpPermissionSet = null,
    VpcId: String = null
  ): StaleSecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (StaleIpPermissions != null) __obj.updateDynamic("StaleIpPermissions")(StaleIpPermissions)
    if (StaleIpPermissionsEgress != null) __obj.updateDynamic("StaleIpPermissionsEgress")(StaleIpPermissionsEgress)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[StaleSecurityGroup]
  }
}

