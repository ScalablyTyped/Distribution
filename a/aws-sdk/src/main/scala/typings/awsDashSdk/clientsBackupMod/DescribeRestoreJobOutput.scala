package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRestoreJobOutput extends js.Object {
  /**
    * The size, in bytes, of the restored resource.
    */
  var BackupSizeInBytes: js.UndefOr[Long] = js.undefined
  /**
    * The date and time that a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[timestamp] = js.undefined
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource whose recovery point is being restored. The format of the ARN depends on the resource type of the backed-up resource.
    */
  var CreatedResourceArn: js.UndefOr[ARN] = js.undefined
  /**
    * The date and time that a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  /**
    * The amount of time in minutes that a job restoring a recovery point is expected to take.
    */
  var ExpectedCompletionTimeMinutes: js.UndefOr[Long] = js.undefined
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  /**
    * Contains an estimated percentage that is complete of a job at the time the job status was queried.
    */
  var PercentDone: js.UndefOr[String] = js.undefined
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: js.UndefOr[String] = js.undefined
  /**
    * Status code specifying the state of the job that is initiated by AWS Backup to restore a recovery point.
    */
  var Status: js.UndefOr[RestoreJobStatus] = js.undefined
  /**
    * A detailed message explaining the status of a job to restore a recovery point.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}

object DescribeRestoreJobOutput {
  @scala.inline
  def apply(
    BackupSizeInBytes: js.UndefOr[Long] = js.undefined,
    CompletionDate: timestamp = null,
    CreatedResourceArn: ARN = null,
    CreationDate: timestamp = null,
    ExpectedCompletionTimeMinutes: js.UndefOr[Long] = js.undefined,
    IamRoleArn: IAMRoleArn = null,
    PercentDone: String = null,
    RecoveryPointArn: ARN = null,
    RestoreJobId: String = null,
    Status: RestoreJobStatus = null,
    StatusMessage: String = null
  ): DescribeRestoreJobOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BackupSizeInBytes)) __obj.updateDynamic("BackupSizeInBytes")(BackupSizeInBytes)
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate)
    if (CreatedResourceArn != null) __obj.updateDynamic("CreatedResourceArn")(CreatedResourceArn)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (!js.isUndefined(ExpectedCompletionTimeMinutes)) __obj.updateDynamic("ExpectedCompletionTimeMinutes")(ExpectedCompletionTimeMinutes)
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn)
    if (PercentDone != null) __obj.updateDynamic("PercentDone")(PercentDone)
    if (RecoveryPointArn != null) __obj.updateDynamic("RecoveryPointArn")(RecoveryPointArn)
    if (RestoreJobId != null) __obj.updateDynamic("RestoreJobId")(RestoreJobId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    __obj.asInstanceOf[DescribeRestoreJobOutput]
  }
}

