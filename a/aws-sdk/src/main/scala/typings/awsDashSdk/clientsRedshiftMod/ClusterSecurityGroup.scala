package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSecurityGroup extends js.Object {
  /**
    * The name of the cluster security group to which the operation was applied.
    */
  var ClusterSecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * A description of the security group.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined
  /**
    * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security group.
    */
  var IPRanges: js.UndefOr[IPRangeList] = js.undefined
  /**
    * The list of tags for the cluster security group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ClusterSecurityGroup {
  @scala.inline
  def apply(
    ClusterSecurityGroupName: String = null,
    Description: String = null,
    EC2SecurityGroups: EC2SecurityGroupList = null,
    IPRanges: IPRangeList = null,
    Tags: TagList = null
  ): ClusterSecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (ClusterSecurityGroupName != null) __obj.updateDynamic("ClusterSecurityGroupName")(ClusterSecurityGroupName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EC2SecurityGroups != null) __obj.updateDynamic("EC2SecurityGroups")(EC2SecurityGroups)
    if (IPRanges != null) __obj.updateDynamic("IPRanges")(IPRanges)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ClusterSecurityGroup]
  }
}

