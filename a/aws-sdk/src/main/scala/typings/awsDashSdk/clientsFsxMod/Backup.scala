package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backup extends js.Object {
  /**
    * The ID of the backup.
    */
  var BackupId: typings.awsDashSdk.clientsFsxMod.BackupId = js.native
  /**
    * The time when a particular backup was created.
    */
  var CreationTime: typings.awsDashSdk.clientsFsxMod.CreationTime = js.native
  /**
    * The configuration of the self-managed Microsoft Active Directory (AD) to which the Windows File Server instance is joined.
    */
  var DirectoryInformation: js.UndefOr[ActiveDirectoryBackupAttributes] = js.native
  /**
    * Details explaining any failures that occur when creating a backup.
    */
  var FailureDetails: js.UndefOr[BackupFailureDetails] = js.native
  /**
    * Metadata of the file system associated with the backup. This metadata is persisted even if the file system is deleted.
    */
  var FileSystem: typings.awsDashSdk.clientsFsxMod.FileSystem = js.native
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt this backup of the Amazon FSx for Windows file system's data at rest. Amazon FSx for Lustre does not support KMS encryption.
    */
  var KmsKeyId: js.UndefOr[typings.awsDashSdk.clientsFsxMod.KmsKeyId] = js.native
  /**
    * The lifecycle status of the backup.
    */
  var Lifecycle: BackupLifecycle = js.native
  var ProgressPercent: js.UndefOr[typings.awsDashSdk.clientsFsxMod.ProgressPercent] = js.native
  /**
    * The Amazon Resource Name (ARN) for the backup resource.
    */
  var ResourceARN: js.UndefOr[typings.awsDashSdk.clientsFsxMod.ResourceARN] = js.native
  /**
    * Tags associated with a particular file system.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsFsxMod.Tags] = js.native
  /**
    * The type of the backup.
    */
  var Type: BackupType = js.native
}

object Backup {
  @scala.inline
  def apply(
    BackupId: BackupId,
    CreationTime: CreationTime,
    FileSystem: FileSystem,
    Lifecycle: BackupLifecycle,
    Type: BackupType,
    DirectoryInformation: ActiveDirectoryBackupAttributes = null,
    FailureDetails: BackupFailureDetails = null,
    KmsKeyId: KmsKeyId = null,
    ProgressPercent: Int | Double = null,
    ResourceARN: ResourceARN = null,
    Tags: Tags = null
  ): Backup = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], FileSystem = FileSystem.asInstanceOf[js.Any], Lifecycle = Lifecycle.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (DirectoryInformation != null) __obj.updateDynamic("DirectoryInformation")(DirectoryInformation.asInstanceOf[js.Any])
    if (FailureDetails != null) __obj.updateDynamic("FailureDetails")(FailureDetails.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (ProgressPercent != null) __obj.updateDynamic("ProgressPercent")(ProgressPercent.asInstanceOf[js.Any])
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backup]
  }
}

