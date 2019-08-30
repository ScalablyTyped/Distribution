package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotMessage extends js.Object {
  /**
    * The identifier of an existing cluster. The snapshot is created from this cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the KMS key used to encrypt the snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The identifier of an existing replication group. The snapshot is created from this replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  /**
    * A name for the snapshot being created.
    */
  var SnapshotName: String
}

object CreateSnapshotMessage {
  @scala.inline
  def apply(
    SnapshotName: String,
    CacheClusterId: String = null,
    KmsKeyId: String = null,
    ReplicationGroupId: String = null
  ): CreateSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotName = SnapshotName)
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId)
    __obj.asInstanceOf[CreateSnapshotMessage]
  }
}

