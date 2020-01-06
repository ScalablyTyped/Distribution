package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheNodeUpdateStatus extends js.Object {
  /**
    * The node ID of the cache cluster
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  /**
    * The deletion date of the node
    */
  var NodeDeletionDate: js.UndefOr[TStamp] = js.native
  /**
    * The end date of the update for a node
    */
  var NodeUpdateEndDate: js.UndefOr[TStamp] = js.native
  /**
    * Reflects whether the update was initiated by the customer or automatically applied
    */
  var NodeUpdateInitiatedBy: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.NodeUpdateInitiatedBy] = js.native
  /**
    * The date when the update is triggered
    */
  var NodeUpdateInitiatedDate: js.UndefOr[TStamp] = js.native
  /**
    * The start date of the update for a node
    */
  var NodeUpdateStartDate: js.UndefOr[TStamp] = js.native
  /**
    * The update status of the node
    */
  var NodeUpdateStatus: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.NodeUpdateStatus] = js.native
  /**
    * The date when the NodeUpdateStatus was last modified&gt;
    */
  var NodeUpdateStatusModifiedDate: js.UndefOr[TStamp] = js.native
}

object CacheNodeUpdateStatus {
  @scala.inline
  def apply(
    CacheNodeId: String = null,
    NodeDeletionDate: TStamp = null,
    NodeUpdateEndDate: TStamp = null,
    NodeUpdateInitiatedBy: NodeUpdateInitiatedBy = null,
    NodeUpdateInitiatedDate: TStamp = null,
    NodeUpdateStartDate: TStamp = null,
    NodeUpdateStatus: NodeUpdateStatus = null,
    NodeUpdateStatusModifiedDate: TStamp = null
  ): CacheNodeUpdateStatus = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeId != null) __obj.updateDynamic("CacheNodeId")(CacheNodeId.asInstanceOf[js.Any])
    if (NodeDeletionDate != null) __obj.updateDynamic("NodeDeletionDate")(NodeDeletionDate.asInstanceOf[js.Any])
    if (NodeUpdateEndDate != null) __obj.updateDynamic("NodeUpdateEndDate")(NodeUpdateEndDate.asInstanceOf[js.Any])
    if (NodeUpdateInitiatedBy != null) __obj.updateDynamic("NodeUpdateInitiatedBy")(NodeUpdateInitiatedBy.asInstanceOf[js.Any])
    if (NodeUpdateInitiatedDate != null) __obj.updateDynamic("NodeUpdateInitiatedDate")(NodeUpdateInitiatedDate.asInstanceOf[js.Any])
    if (NodeUpdateStartDate != null) __obj.updateDynamic("NodeUpdateStartDate")(NodeUpdateStartDate.asInstanceOf[js.Any])
    if (NodeUpdateStatus != null) __obj.updateDynamic("NodeUpdateStatus")(NodeUpdateStatus.asInstanceOf[js.Any])
    if (NodeUpdateStatusModifiedDate != null) __obj.updateDynamic("NodeUpdateStatusModifiedDate")(NodeUpdateStatusModifiedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheNodeUpdateStatus]
  }
}

