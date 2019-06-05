package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeGroupUpdateStatus extends js.Object {
  /**
    * The ID of the node group
    */
  var NodeGroupId: js.UndefOr[String] = js.undefined
  /**
    * The status of the service update on the node group member
    */
  var NodeGroupMemberUpdateStatus: js.UndefOr[NodeGroupMemberUpdateStatusList] = js.undefined
}

object NodeGroupUpdateStatus {
  @scala.inline
  def apply(NodeGroupId: String = null, NodeGroupMemberUpdateStatus: NodeGroupMemberUpdateStatusList = null): NodeGroupUpdateStatus = {
    val __obj = js.Dynamic.literal()
    if (NodeGroupId != null) __obj.updateDynamic("NodeGroupId")(NodeGroupId)
    if (NodeGroupMemberUpdateStatus != null) __obj.updateDynamic("NodeGroupMemberUpdateStatus")(NodeGroupMemberUpdateStatus)
    __obj.asInstanceOf[NodeGroupUpdateStatus]
  }
}

