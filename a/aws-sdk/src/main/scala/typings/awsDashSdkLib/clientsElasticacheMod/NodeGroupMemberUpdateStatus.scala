package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeGroupMemberUpdateStatus extends js.Object {
  /**
    * The cache cluster ID
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  /**
    * The node ID of the cache cluster
    */
  var CacheNodeId: js.UndefOr[String] = js.undefined
  /**
    * The deletion date of the node
    */
  var NodeDeletionDate: js.UndefOr[TStamp] = js.undefined
  /**
    * The end date of the update for a node
    */
  var NodeUpdateEndDate: js.UndefOr[TStamp] = js.undefined
  /**
    * Reflects whether the update was initiated by the customer or automatically applied
    */
  var NodeUpdateInitiatedBy: js.UndefOr[NodeUpdateInitiatedBy] = js.undefined
  /**
    * The date when the update is triggered
    */
  var NodeUpdateInitiatedDate: js.UndefOr[TStamp] = js.undefined
  /**
    * The start date of the update for a node
    */
  var NodeUpdateStartDate: js.UndefOr[TStamp] = js.undefined
  /**
    * The update status of the node
    */
  var NodeUpdateStatus: js.UndefOr[NodeUpdateStatus] = js.undefined
  /**
    * The date when the NodeUpdateStatus was last modified
    */
  var NodeUpdateStatusModifiedDate: js.UndefOr[TStamp] = js.undefined
}

object NodeGroupMemberUpdateStatus {
  @scala.inline
  def apply(
    CacheClusterId: String = null,
    CacheNodeId: String = null,
    NodeDeletionDate: TStamp = null,
    NodeUpdateEndDate: TStamp = null,
    NodeUpdateInitiatedBy: NodeUpdateInitiatedBy = null,
    NodeUpdateInitiatedDate: TStamp = null,
    NodeUpdateStartDate: TStamp = null,
    NodeUpdateStatus: NodeUpdateStatus = null,
    NodeUpdateStatusModifiedDate: TStamp = null
  ): NodeGroupMemberUpdateStatus = {
    val __obj = js.Dynamic.literal()
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId)
    if (CacheNodeId != null) __obj.updateDynamic("CacheNodeId")(CacheNodeId)
    if (NodeDeletionDate != null) __obj.updateDynamic("NodeDeletionDate")(NodeDeletionDate)
    if (NodeUpdateEndDate != null) __obj.updateDynamic("NodeUpdateEndDate")(NodeUpdateEndDate)
    if (NodeUpdateInitiatedBy != null) __obj.updateDynamic("NodeUpdateInitiatedBy")(NodeUpdateInitiatedBy.asInstanceOf[js.Any])
    if (NodeUpdateInitiatedDate != null) __obj.updateDynamic("NodeUpdateInitiatedDate")(NodeUpdateInitiatedDate)
    if (NodeUpdateStartDate != null) __obj.updateDynamic("NodeUpdateStartDate")(NodeUpdateStartDate)
    if (NodeUpdateStatus != null) __obj.updateDynamic("NodeUpdateStatus")(NodeUpdateStatus.asInstanceOf[js.Any])
    if (NodeUpdateStatusModifiedDate != null) __obj.updateDynamic("NodeUpdateStatusModifiedDate")(NodeUpdateStatusModifiedDate)
    __obj.asInstanceOf[NodeGroupMemberUpdateStatus]
  }
}

