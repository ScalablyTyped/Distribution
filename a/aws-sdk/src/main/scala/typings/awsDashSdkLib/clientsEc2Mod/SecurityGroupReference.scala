package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupReference extends js.Object {
  /**
    * The ID of your security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPC with the referencing security group.
    */
  var ReferencingVpcId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
}

object SecurityGroupReference {
  @scala.inline
  def apply(GroupId: String = null, ReferencingVpcId: String = null, VpcPeeringConnectionId: String = null): SecurityGroupReference = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    if (ReferencingVpcId != null) __obj.updateDynamic("ReferencingVpcId")(ReferencingVpcId)
    if (VpcPeeringConnectionId != null) __obj.updateDynamic("VpcPeeringConnectionId")(VpcPeeringConnectionId)
    __obj.asInstanceOf[SecurityGroupReference]
  }
}

