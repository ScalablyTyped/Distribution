package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationSubnetGroup extends js.Object {
  /**
    * A description for the replication subnet group.
    */
  var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the replication instance subnet group.
    */
  var ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The status of the subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.undefined
  /**
    * The subnets that are in the subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object ReplicationSubnetGroup {
  @scala.inline
  def apply(
    ReplicationSubnetGroupDescription: String = null,
    ReplicationSubnetGroupIdentifier: String = null,
    SubnetGroupStatus: String = null,
    Subnets: SubnetList = null,
    VpcId: String = null
  ): ReplicationSubnetGroup = {
    val __obj = js.Dynamic.literal()
    if (ReplicationSubnetGroupDescription != null) __obj.updateDynamic("ReplicationSubnetGroupDescription")(ReplicationSubnetGroupDescription)
    if (ReplicationSubnetGroupIdentifier != null) __obj.updateDynamic("ReplicationSubnetGroupIdentifier")(ReplicationSubnetGroupIdentifier)
    if (SubnetGroupStatus != null) __obj.updateDynamic("SubnetGroupStatus")(SubnetGroupStatus)
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[ReplicationSubnetGroup]
  }
}

