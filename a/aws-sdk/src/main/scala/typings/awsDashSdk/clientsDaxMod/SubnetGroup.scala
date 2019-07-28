package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetGroup extends js.Object {
  /**
    * The description of the subnet group.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The name of the subnet group.
    */
  var SubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * A list of subnets associated with the subnet group. 
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
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
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (SubnetGroupName != null) __obj.updateDynamic("SubnetGroupName")(SubnetGroupName)
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[SubnetGroup]
  }
}

