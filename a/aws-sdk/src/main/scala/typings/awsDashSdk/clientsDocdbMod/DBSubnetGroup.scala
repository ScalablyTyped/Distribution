package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSubnetGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the DB subnet group.
    */
  var DBSubnetGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides the description of the DB subnet group.
    */
  var DBSubnetGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name of the DB subnet group.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * Provides the status of the DB subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.native
  /**
    * Detailed information about one or more subnets within a DB subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  /**
    * Provides the virtual private cloud (VPC) ID of the DB subnet group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DBSubnetGroup {
  @scala.inline
  def apply(
    DBSubnetGroupArn: String = null,
    DBSubnetGroupDescription: String = null,
    DBSubnetGroupName: String = null,
    SubnetGroupStatus: String = null,
    Subnets: SubnetList = null,
    VpcId: String = null
  ): DBSubnetGroup = {
    val __obj = js.Dynamic.literal()
    if (DBSubnetGroupArn != null) __obj.updateDynamic("DBSubnetGroupArn")(DBSubnetGroupArn.asInstanceOf[js.Any])
    if (DBSubnetGroupDescription != null) __obj.updateDynamic("DBSubnetGroupDescription")(DBSubnetGroupDescription.asInstanceOf[js.Any])
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName.asInstanceOf[js.Any])
    if (SubnetGroupStatus != null) __obj.updateDynamic("SubnetGroupStatus")(SubnetGroupStatus.asInstanceOf[js.Any])
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBSubnetGroup]
  }
}

