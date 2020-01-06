package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationGroupMessage extends js.Object {
  /**
    * The name of a final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in the cluster, rather than one of the replicas; this is to ensure that it captures the freshest data. After the final snapshot is taken, the replication group is immediately deleted.
    */
  var FinalSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * The identifier for the cluster to be deleted. This parameter is not case sensitive.
    */
  var ReplicationGroupId: String = js.native
  /**
    * If set to true, all of the read replicas are deleted, but the primary node is retained.
    */
  var RetainPrimaryCluster: js.UndefOr[BooleanOptional] = js.native
}

object DeleteReplicationGroupMessage {
  @scala.inline
  def apply(
    ReplicationGroupId: String,
    FinalSnapshotIdentifier: String = null,
    RetainPrimaryCluster: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    if (FinalSnapshotIdentifier != null) __obj.updateDynamic("FinalSnapshotIdentifier")(FinalSnapshotIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(RetainPrimaryCluster)) __obj.updateDynamic("RetainPrimaryCluster")(RetainPrimaryCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationGroupMessage]
  }
}

