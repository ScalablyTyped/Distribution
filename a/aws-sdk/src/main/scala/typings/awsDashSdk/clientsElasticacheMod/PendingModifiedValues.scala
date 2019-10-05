package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingModifiedValues extends js.Object {
  /**
    * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.undefined
  /**
    * The cache node type that this cluster or replication group is scaled to.
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  /**
    * The new cache engine version that the cluster runs.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The new number of cache nodes for the cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
}

object PendingModifiedValues {
  @scala.inline
  def apply(
    CacheNodeIdsToRemove: CacheNodeIdsList = null,
    CacheNodeType: String = null,
    EngineVersion: String = null,
    NumCacheNodes: Int | scala.Double = null
  ): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeIdsToRemove != null) __obj.updateDynamic("CacheNodeIdsToRemove")(CacheNodeIdsToRemove)
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (NumCacheNodes != null) __obj.updateDynamic("NumCacheNodes")(NumCacheNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingModifiedValues]
  }
}

