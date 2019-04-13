package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAllowedNodeTypeModificationsMessage extends js.Object {
  /**
    * The name of the cluster you want to scale up to a larger node instanced type. ElastiCache uses the cluster id to identify the current node type of this cluster and from that to create a list of node types you can scale up to.  You must provide a value for either the CacheClusterId or the ReplicationGroupId. 
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  /**
    * The name of the replication group want to scale up to a larger node type. ElastiCache uses the replication group id to identify the current node type being used by this replication group, and from that to create a list of node types you can scale up to.  You must provide a value for either the CacheClusterId or the ReplicationGroupId. 
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
}

object ListAllowedNodeTypeModificationsMessage {
  @scala.inline
  def apply(CacheClusterId: String = null, ReplicationGroupId: String = null): ListAllowedNodeTypeModificationsMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId)
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId)
    __obj.asInstanceOf[ListAllowedNodeTypeModificationsMessage]
  }
}

