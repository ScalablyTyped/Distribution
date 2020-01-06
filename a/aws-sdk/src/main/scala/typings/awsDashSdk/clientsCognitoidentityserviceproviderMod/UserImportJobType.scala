package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserImportJobType extends js.Object {
  /**
    * The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[ArnType] = js.native
  /**
    * The date when the user import job was completed.
    */
  var CompletionDate: js.UndefOr[DateType] = js.native
  /**
    * The message returned when the user import job is completed.
    */
  var CompletionMessage: js.UndefOr[CompletionMessageType] = js.native
  /**
    * The date the user import job was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  /**
    * The number of users that could not be imported.
    */
  var FailedUsers: js.UndefOr[LongType] = js.native
  /**
    * The number of users that were successfully imported.
    */
  var ImportedUsers: js.UndefOr[LongType] = js.native
  /**
    * The job ID for the user import job.
    */
  var JobId: js.UndefOr[UserImportJobIdType] = js.native
  /**
    * The job name for the user import job.
    */
  var JobName: js.UndefOr[UserImportJobNameType] = js.native
  /**
    * The pre-signed URL to be used to upload the .csv file.
    */
  var PreSignedUrl: js.UndefOr[PreSignedUrlType] = js.native
  /**
    * The number of users that were skipped.
    */
  var SkippedUsers: js.UndefOr[LongType] = js.native
  /**
    * The date when the user import job was started.
    */
  var StartDate: js.UndefOr[DateType] = js.native
  /**
    * The status of the user import job. One of the following:    Created - The job was created but not started.    Pending - A transition state. You have started the job, but it has not begun importing users yet.    InProgress - The job has started, and users are being imported.    Stopping - You have stopped the job, but the job has not stopped importing users yet.    Stopped - You have stopped the job, and the job has stopped importing users.    Succeeded - The job has completed successfully.    Failed - The job has stopped due to an error.    Expired - You created a job, but did not start the job within 24-48 hours. All data associated with the job was deleted, and the job cannot be started.  
    */
  var Status: js.UndefOr[UserImportJobStatusType] = js.native
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object UserImportJobType {
  @scala.inline
  def apply(
    CloudWatchLogsRoleArn: ArnType = null,
    CompletionDate: DateType = null,
    CompletionMessage: CompletionMessageType = null,
    CreationDate: DateType = null,
    FailedUsers: Int | Double = null,
    ImportedUsers: Int | Double = null,
    JobId: UserImportJobIdType = null,
    JobName: UserImportJobNameType = null,
    PreSignedUrl: PreSignedUrlType = null,
    SkippedUsers: Int | Double = null,
    StartDate: DateType = null,
    Status: UserImportJobStatusType = null,
    UserPoolId: UserPoolIdType = null
  ): UserImportJobType = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogsRoleArn != null) __obj.updateDynamic("CloudWatchLogsRoleArn")(CloudWatchLogsRoleArn.asInstanceOf[js.Any])
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate.asInstanceOf[js.Any])
    if (CompletionMessage != null) __obj.updateDynamic("CompletionMessage")(CompletionMessage.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (FailedUsers != null) __obj.updateDynamic("FailedUsers")(FailedUsers.asInstanceOf[js.Any])
    if (ImportedUsers != null) __obj.updateDynamic("ImportedUsers")(ImportedUsers.asInstanceOf[js.Any])
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    if (PreSignedUrl != null) __obj.updateDynamic("PreSignedUrl")(PreSignedUrl.asInstanceOf[js.Any])
    if (SkippedUsers != null) __obj.updateDynamic("SkippedUsers")(SkippedUsers.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserImportJobType]
  }
}

