package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyDBClusterSnapshotMessage extends js.Object {
  /**
    * True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise false. The default is false.
    */
  var CopyTags: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The AWS AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key. If you copy an unencrypted DB cluster snapshot and specify a value for the KmsKeyId parameter, Amazon Neptune encrypts the target DB cluster snapshot using the specified KMS encryption key. If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for KmsKeyId to encrypt the copy with a new KMS encryption key. If you don't specify a value for KmsKeyId, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the source DB cluster snapshot. If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must specify a value for KmsKeyId.  KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys from one AWS Region in another AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * Not currently supported.
    */
  var PreSignedUrl: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the DB cluster snapshot to copy. This parameter is not case-sensitive. You can't copy from one AWS Region to another. Constraints:   Must specify a valid system snapshot in the "available" state.   Specify a valid DB snapshot identifier.   Example: my-cluster-snapshot1 
    */
  var SourceDBClusterSnapshotIdentifier: String
  /**
    * The tags to assign to the new DB cluster snapshot copy.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This parameter is not case-sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster-snapshot2 
    */
  var TargetDBClusterSnapshotIdentifier: String
}

object CopyDBClusterSnapshotMessage {
  @scala.inline
  def apply(
    SourceDBClusterSnapshotIdentifier: String,
    TargetDBClusterSnapshotIdentifier: String,
    CopyTags: js.UndefOr[BooleanOptional] = js.undefined,
    KmsKeyId: String = null,
    PreSignedUrl: String = null,
    Tags: TagList = null
  ): CopyDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceDBClusterSnapshotIdentifier = SourceDBClusterSnapshotIdentifier, TargetDBClusterSnapshotIdentifier = TargetDBClusterSnapshotIdentifier)
    if (!js.isUndefined(CopyTags)) __obj.updateDynamic("CopyTags")(CopyTags)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (PreSignedUrl != null) __obj.updateDynamic("PreSignedUrl")(PreSignedUrl)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CopyDBClusterSnapshotMessage]
  }
}

