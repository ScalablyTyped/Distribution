package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeSnapshot extends js.Object {
  /**
    * A unique identifier for the source cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the cache node was created in the source cluster.
    */
  var CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The cache node identifier for the node in the source cluster.
    */
  var CacheNodeId: js.UndefOr[String] = js.undefined
  /**
    * The size of the cache on the source cache node.
    */
  var CacheSize: js.UndefOr[String] = js.undefined
  /**
    * The configuration for the source node group (shard).
    */
  var NodeGroupConfiguration: js.UndefOr[NodeGroupConfiguration] = js.undefined
  /**
    * A unique identifier for the source node group (shard).
    */
  var NodeGroupId: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the source node's metadata and cache data set was obtained for the snapshot.
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
}

object NodeSnapshot {
  @scala.inline
  def apply(
    CacheClusterId: String = null,
    CacheNodeCreateTime: TStamp = null,
    CacheNodeId: String = null,
    CacheSize: String = null,
    NodeGroupConfiguration: NodeGroupConfiguration = null,
    NodeGroupId: String = null,
    SnapshotCreateTime: TStamp = null
  ): NodeSnapshot = {
    val __obj = js.Dynamic.literal()
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId)
    if (CacheNodeCreateTime != null) __obj.updateDynamic("CacheNodeCreateTime")(CacheNodeCreateTime)
    if (CacheNodeId != null) __obj.updateDynamic("CacheNodeId")(CacheNodeId)
    if (CacheSize != null) __obj.updateDynamic("CacheSize")(CacheSize)
    if (NodeGroupConfiguration != null) __obj.updateDynamic("NodeGroupConfiguration")(NodeGroupConfiguration)
    if (NodeGroupId != null) __obj.updateDynamic("NodeGroupId")(NodeGroupId)
    if (SnapshotCreateTime != null) __obj.updateDynamic("SnapshotCreateTime")(SnapshotCreateTime)
    __obj.asInstanceOf[NodeSnapshot]
  }
}

