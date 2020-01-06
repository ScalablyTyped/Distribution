package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterSubnetGroupMessage extends js.Object {
  /**
    * The name of the subnet group to be modified.
    */
  var ClusterSubnetGroupName: String = js.native
  /**
    * A text description of the subnet group to be modified.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
    */
  var SubnetIds: SubnetIdentifierList = js.native
}

object ModifyClusterSubnetGroupMessage {
  @scala.inline
  def apply(ClusterSubnetGroupName: String, SubnetIds: SubnetIdentifierList, Description: String = null): ModifyClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSubnetGroupName = ClusterSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSubnetGroupMessage]
  }
}

