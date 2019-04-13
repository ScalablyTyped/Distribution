package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backup extends js.Object {
  /**
    * The ID of the backup.
    */
  var BackupId: awsDashSdkLib.clientsFsxMod.BackupId
  /**
    * The time when a particular backup was created.
    */
  var CreationTime: awsDashSdkLib.clientsFsxMod.CreationTime
  /**
    * Details explaining any failures that occur when creating a backup.
    */
  var FailureDetails: js.UndefOr[BackupFailureDetails] = js.undefined
  /**
    * Metadata of the file system associated with the backup. This metadata is persisted even if the file system is deleted.
    */
  var FileSystem: awsDashSdkLib.clientsFsxMod.FileSystem
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt this backup's data.
    */
  var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * The lifecycle status of the backup.
    */
  var Lifecycle: BackupLifecycle
  var ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the backup resource.
    */
  var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * Tags associated with a particular file system.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * The type of the backup.
    */
  var Type: BackupType
}

object Backup {
  @scala.inline
  def apply(
    BackupId: BackupId,
    CreationTime: CreationTime,
    FileSystem: FileSystem,
    Lifecycle: BackupLifecycle,
    Type: BackupType,
    FailureDetails: BackupFailureDetails = null,
    KmsKeyId: KmsKeyId = null,
    ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
    ResourceARN: ResourceARN = null,
    Tags: Tags = null
  ): Backup = {
    val __obj = js.Dynamic.literal(BackupId = BackupId, CreationTime = CreationTime, FileSystem = FileSystem, Lifecycle = Lifecycle.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (FailureDetails != null) __obj.updateDynamic("FailureDetails")(FailureDetails)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (!js.isUndefined(ProgressPercent)) __obj.updateDynamic("ProgressPercent")(ProgressPercent)
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[Backup]
  }
}

