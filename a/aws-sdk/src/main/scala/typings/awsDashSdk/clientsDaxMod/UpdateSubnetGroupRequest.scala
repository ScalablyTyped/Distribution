package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubnetGroupRequest extends js.Object {
  /**
    * A description of the subnet group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the subnet group.
    */
  var SubnetGroupName: String = js.native
  /**
    * A list of subnet IDs in the subnet group.
    */
  var SubnetIds: js.UndefOr[SubnetIdentifierList] = js.native
}

object UpdateSubnetGroupRequest {
  @scala.inline
  def apply(SubnetGroupName: String, Description: String = null, SubnetIds: SubnetIdentifierList = null): UpdateSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubnetGroupRequest]
  }
}

