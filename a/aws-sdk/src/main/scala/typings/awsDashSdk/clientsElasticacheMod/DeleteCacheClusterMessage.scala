package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCacheClusterMessage extends js.Object {
  /**
    * The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
    */
  var CacheClusterId: String = js.native
  /**
    * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot. ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
    */
  var FinalSnapshotIdentifier: js.UndefOr[String] = js.native
}

object DeleteCacheClusterMessage {
  @scala.inline
  def apply(CacheClusterId: String, FinalSnapshotIdentifier: String = null): DeleteCacheClusterMessage = {
    val __obj = js.Dynamic.literal(CacheClusterId = CacheClusterId.asInstanceOf[js.Any])
    if (FinalSnapshotIdentifier != null) __obj.updateDynamic("FinalSnapshotIdentifier")(FinalSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheClusterMessage]
  }
}

