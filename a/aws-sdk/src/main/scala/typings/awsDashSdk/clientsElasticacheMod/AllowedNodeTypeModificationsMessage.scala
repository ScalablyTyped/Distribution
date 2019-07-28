package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowedNodeTypeModificationsMessage extends js.Object {
  /**
    * A string list, each element of which specifies a cache node type which you can use to scale your cluster or replication group. When scaling up a Redis cluster or replication group using ModifyCacheCluster or ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
    */
  var ScaleUpModifications: js.UndefOr[NodeTypeList] = js.undefined
}

object AllowedNodeTypeModificationsMessage {
  @scala.inline
  def apply(ScaleUpModifications: NodeTypeList = null): AllowedNodeTypeModificationsMessage = {
    val __obj = js.Dynamic.literal()
    if (ScaleUpModifications != null) __obj.updateDynamic("ScaleUpModifications")(ScaleUpModifications)
    __obj.asInstanceOf[AllowedNodeTypeModificationsMessage]
  }
}

