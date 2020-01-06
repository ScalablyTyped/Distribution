package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopySnapshotMessage extends js.Object {
  /**
    * The ID of the KMS key used to encrypt the target snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The name of an existing snapshot from which to make a copy.
    */
  var SourceSnapshotName: String = js.native
  /**
    * The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a snapshot for external access. When using this parameter to export a snapshot, be sure Amazon ElastiCache has the needed permissions to this S3 bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the Amazon ElastiCache User Guide. For more information, see Exporting a Snapshot in the Amazon ElastiCache User Guide.
    */
  var TargetBucket: js.UndefOr[String] = js.native
  /**
    * A name for the snapshot copy. ElastiCache does not permit overwriting a snapshot, therefore this name must be unique within its context - ElastiCache or an Amazon S3 bucket if exporting.
    */
  var TargetSnapshotName: String = js.native
}

object CopySnapshotMessage {
  @scala.inline
  def apply(
    SourceSnapshotName: String,
    TargetSnapshotName: String,
    KmsKeyId: String = null,
    TargetBucket: String = null
  ): CopySnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceSnapshotName = SourceSnapshotName.asInstanceOf[js.Any], TargetSnapshotName = TargetSnapshotName.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (TargetBucket != null) __obj.updateDynamic("TargetBucket")(TargetBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopySnapshotMessage]
  }
}

