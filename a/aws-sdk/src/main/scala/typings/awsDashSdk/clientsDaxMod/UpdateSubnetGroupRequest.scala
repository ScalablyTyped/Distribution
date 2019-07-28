package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSubnetGroupRequest extends js.Object {
  /**
    * A description of the subnet group.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The name of the subnet group.
    */
  var SubnetGroupName: String
  /**
    * A list of subnet IDs in the subnet group.
    */
  var SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
}

object UpdateSubnetGroupRequest {
  @scala.inline
  def apply(SubnetGroupName: String, Description: String = null, SubnetIds: SubnetIdentifierList = null): UpdateSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    __obj.asInstanceOf[UpdateSubnetGroupRequest]
  }
}

