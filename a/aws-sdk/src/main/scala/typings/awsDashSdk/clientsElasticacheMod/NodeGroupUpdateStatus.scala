package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupUpdateStatus extends js.Object {
  /**
    * The ID of the node group
    */
  var NodeGroupId: js.UndefOr[String] = js.native
  /**
    * The status of the service update on the node group member
    */
  var NodeGroupMemberUpdateStatus: js.UndefOr[NodeGroupMemberUpdateStatusList] = js.native
}

object NodeGroupUpdateStatus {
  @scala.inline
  def apply(NodeGroupId: String = null, NodeGroupMemberUpdateStatus: NodeGroupMemberUpdateStatusList = null): NodeGroupUpdateStatus = {
    val __obj = js.Dynamic.literal()
    if (NodeGroupId != null) __obj.updateDynamic("NodeGroupId")(NodeGroupId.asInstanceOf[js.Any])
    if (NodeGroupMemberUpdateStatus != null) __obj.updateDynamic("NodeGroupMemberUpdateStatus")(NodeGroupMemberUpdateStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupUpdateStatus]
  }
}

