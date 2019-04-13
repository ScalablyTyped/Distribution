package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSubnetGroup extends js.Object {
  /**
    * The name of the cluster subnet group.
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * The description of the cluster subnet group.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The status of the cluster subnet group. Possible values are Complete, Incomplete and Invalid. 
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.undefined
  /**
    * A list of the VPC Subnet elements. 
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  /**
    * The list of tags for the cluster subnet group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The VPC ID of the cluster subnet group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object ClusterSubnetGroup {
  @scala.inline
  def apply(
    ClusterSubnetGroupName: String = null,
    Description: String = null,
    SubnetGroupStatus: String = null,
    Subnets: SubnetList = null,
    Tags: TagList = null,
    VpcId: String = null
  ): ClusterSubnetGroup = {
    val __obj = js.Dynamic.literal()
    if (ClusterSubnetGroupName != null) __obj.updateDynamic("ClusterSubnetGroupName")(ClusterSubnetGroupName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (SubnetGroupStatus != null) __obj.updateDynamic("SubnetGroupStatus")(SubnetGroupStatus)
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[ClusterSubnetGroup]
  }
}

