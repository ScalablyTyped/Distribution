package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeGroup extends js.Object {
  /**
    * The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains only 1 node group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group contains 1 to 15 node groups numbered 0001 to 0015. Optionally, the user can provide the id for a node group. 
    */
  var NodeGroupId: js.UndefOr[String] = js.undefined
  /**
    * A list containing information about individual nodes within the node group (shard).
    */
  var NodeGroupMembers: js.UndefOr[NodeGroupMemberList] = js.undefined
  /**
    * The endpoint of the primary node in this node group (shard).
    */
  var PrimaryEndpoint: js.UndefOr[Endpoint] = js.undefined
  /**
    * The keyspace for this node group (shard).
    */
  var Slots: js.UndefOr[String] = js.undefined
  /**
    * The current state of this replication group - creating, available, etc.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object NodeGroup {
  @scala.inline
  def apply(
    NodeGroupId: String = null,
    NodeGroupMembers: NodeGroupMemberList = null,
    PrimaryEndpoint: Endpoint = null,
    Slots: String = null,
    Status: String = null
  ): NodeGroup = {
    val __obj = js.Dynamic.literal()
    if (NodeGroupId != null) __obj.updateDynamic("NodeGroupId")(NodeGroupId)
    if (NodeGroupMembers != null) __obj.updateDynamic("NodeGroupMembers")(NodeGroupMembers)
    if (PrimaryEndpoint != null) __obj.updateDynamic("PrimaryEndpoint")(PrimaryEndpoint)
    if (Slots != null) __obj.updateDynamic("Slots")(Slots)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[NodeGroup]
  }
}

