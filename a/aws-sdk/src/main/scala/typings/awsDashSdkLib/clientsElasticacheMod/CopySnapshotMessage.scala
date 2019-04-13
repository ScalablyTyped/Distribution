package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopySnapshotMessage extends js.Object {
  /**
    * The name of an existing snapshot from which to make a copy.
    */
  var SourceSnapshotName: String
  /**
    * The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a snapshot for external access. When using this parameter to export a snapshot, be sure Amazon ElastiCache has the needed permissions to this S3 bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the Amazon ElastiCache User Guide. For more information, see Exporting a Snapshot in the Amazon ElastiCache User Guide.
    */
  var TargetBucket: js.UndefOr[String] = js.undefined
  /**
    * A name for the snapshot copy. ElastiCache does not permit overwriting a snapshot, therefore this name must be unique within its context - ElastiCache or an Amazon S3 bucket if exporting.
    */
  var TargetSnapshotName: String
}

object CopySnapshotMessage {
  @scala.inline
  def apply(SourceSnapshotName: String, TargetSnapshotName: String, TargetBucket: String = null): CopySnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceSnapshotName = SourceSnapshotName, TargetSnapshotName = TargetSnapshotName)
    if (TargetBucket != null) __obj.updateDynamic("TargetBucket")(TargetBucket)
    __obj.asInstanceOf[CopySnapshotMessage]
  }
}

