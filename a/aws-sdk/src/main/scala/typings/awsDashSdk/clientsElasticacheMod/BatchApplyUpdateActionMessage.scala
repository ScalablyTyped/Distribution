package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchApplyUpdateActionMessage extends js.Object {
  /**
    * The cache cluster IDs
    */
  var CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.undefined
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.undefined
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: String
}

object BatchApplyUpdateActionMessage {
  @scala.inline
  def apply(
    ServiceUpdateName: String,
    CacheClusterIds: CacheClusterIdList = null,
    ReplicationGroupIds: ReplicationGroupIdList = null
  ): BatchApplyUpdateActionMessage = {
    val __obj = js.Dynamic.literal(ServiceUpdateName = ServiceUpdateName)
    if (CacheClusterIds != null) __obj.updateDynamic("CacheClusterIds")(CacheClusterIds)
    if (ReplicationGroupIds != null) __obj.updateDynamic("ReplicationGroupIds")(ReplicationGroupIds)
    __obj.asInstanceOf[BatchApplyUpdateActionMessage]
  }
}

