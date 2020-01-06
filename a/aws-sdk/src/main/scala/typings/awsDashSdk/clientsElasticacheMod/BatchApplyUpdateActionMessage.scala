package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchApplyUpdateActionMessage extends js.Object {
  /**
    * The cache cluster IDs
    */
  var CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.native
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.native
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: String = js.native
}

object BatchApplyUpdateActionMessage {
  @scala.inline
  def apply(
    ServiceUpdateName: String,
    CacheClusterIds: CacheClusterIdList = null,
    ReplicationGroupIds: ReplicationGroupIdList = null
  ): BatchApplyUpdateActionMessage = {
    val __obj = js.Dynamic.literal(ServiceUpdateName = ServiceUpdateName.asInstanceOf[js.Any])
    if (CacheClusterIds != null) __obj.updateDynamic("CacheClusterIds")(CacheClusterIds.asInstanceOf[js.Any])
    if (ReplicationGroupIds != null) __obj.updateDynamic("ReplicationGroupIds")(ReplicationGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchApplyUpdateActionMessage]
  }
}

