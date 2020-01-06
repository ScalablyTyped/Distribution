package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetGroup extends js.Object {
  /**
    * The description of the subnet group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the subnet group.
    */
  var SubnetGroupName: js.UndefOr[String] = js.native
  /**
    * A list of subnets associated with the subnet group. 
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object SubnetGroup {
  @scala.inline
  def apply(
    Description: String = null,
    SubnetGroupName: String = null,
    Subnets: SubnetList = null,
    VpcId: String = null
  ): SubnetGroup = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (SubnetGroupName != null) __obj.updateDynamic("SubnetGroupName")(SubnetGroupName.asInstanceOf[js.Any])
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetGroup]
  }
}

