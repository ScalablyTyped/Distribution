package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSubnetGroupRequest extends js.Object {
  /**
    * A description for the subnet group
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * A name for the subnet group. This value is stored as a lowercase string. 
    */
  var SubnetGroupName: String
  /**
    * A list of VPC subnet IDs for the subnet group.
    */
  var SubnetIds: SubnetIdentifierList
}

object CreateSubnetGroupRequest {
  @scala.inline
  def apply(SubnetGroupName: String, SubnetIds: SubnetIdentifierList, Description: String = null): CreateSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName, SubnetIds = SubnetIds)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateSubnetGroupRequest]
  }
}

