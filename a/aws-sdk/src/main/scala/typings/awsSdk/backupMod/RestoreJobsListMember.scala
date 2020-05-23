package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreJobsListMember extends js.Object {
  /**
    * The size, in bytes, of the restored resource.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.native
  /**
    * The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[timestamp] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var CreatedResourceArn: js.UndefOr[ARN] = js.native
  /**
    * The date and time a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.native
  /**
    * The amount of time in minutes that a job restoring a recovery point is expected to take.
    */
  var ExpectedCompletionTimeMinutes: js.UndefOr[Long_] = js.native
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * Contains an estimated percentage complete of a job at the time the job status was queried.
    */
  var PercentDone: js.UndefOr[String] = js.native
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: js.UndefOr[String] = js.native
  /**
    * A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
    */
  var Status: js.UndefOr[RestoreJobStatus] = js.native
  /**
    * A detailed message explaining the status of the job to restore a recovery point.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object RestoreJobsListMember {
  @scala.inline
  def apply(
    BackupSizeInBytes: js.UndefOr[Long_] = js.undefined,
    CompletionDate: timestamp = null,
    CreatedResourceArn: ARN = null,
    CreationDate: timestamp = null,
    ExpectedCompletionTimeMinutes: js.UndefOr[Long_] = js.undefined,
    IamRoleArn: IAMRoleArn = null,
    PercentDone: String = null,
    RecoveryPointArn: ARN = null,
    RestoreJobId: String = null,
    Status: RestoreJobStatus = null,
    StatusMessage: String = null
  ): RestoreJobsListMember = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BackupSizeInBytes)) __obj.updateDynamic("BackupSizeInBytes")(BackupSizeInBytes.get.asInstanceOf[js.Any])
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate.asInstanceOf[js.Any])
    if (CreatedResourceArn != null) __obj.updateDynamic("CreatedResourceArn")(CreatedResourceArn.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(ExpectedCompletionTimeMinutes)) __obj.updateDynamic("ExpectedCompletionTimeMinutes")(ExpectedCompletionTimeMinutes.get.asInstanceOf[js.Any])
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn.asInstanceOf[js.Any])
    if (PercentDone != null) __obj.updateDynamic("PercentDone")(PercentDone.asInstanceOf[js.Any])
    if (RecoveryPointArn != null) __obj.updateDynamic("RecoveryPointArn")(RecoveryPointArn.asInstanceOf[js.Any])
    if (RestoreJobId != null) __obj.updateDynamic("RestoreJobId")(RestoreJobId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreJobsListMember]
  }
}

