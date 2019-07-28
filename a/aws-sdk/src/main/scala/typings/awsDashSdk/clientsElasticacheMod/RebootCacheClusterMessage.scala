package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootCacheClusterMessage extends js.Object {
  /**
    * The cluster identifier. This parameter is stored as a lowercase string.
    */
  var CacheClusterId: String
  /**
    * A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an entire cluster, specify all of the cache node IDs.
    */
  var CacheNodeIdsToReboot: CacheNodeIdsList
}

object RebootCacheClusterMessage {
  @scala.inline
  def apply(CacheClusterId: String, CacheNodeIdsToReboot: CacheNodeIdsList): RebootCacheClusterMessage = {
    val __obj = js.Dynamic.literal(CacheClusterId = CacheClusterId, CacheNodeIdsToReboot = CacheNodeIdsToReboot)
  
    __obj.asInstanceOf[RebootCacheClusterMessage]
  }
}

