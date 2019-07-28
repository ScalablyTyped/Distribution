package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserImportJobType extends js.Object {
  /**
    * The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[ArnType] = js.undefined
  /**
    * The date when the user import job was completed.
    */
  var CompletionDate: js.UndefOr[DateType] = js.undefined
  /**
    * The message returned when the user import job is completed.
    */
  var CompletionMessage: js.UndefOr[CompletionMessageType] = js.undefined
  /**
    * The date the user import job was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The number of users that could not be imported.
    */
  var FailedUsers: js.UndefOr[LongType] = js.undefined
  /**
    * The number of users that were successfully imported.
    */
  var ImportedUsers: js.UndefOr[LongType] = js.undefined
  /**
    * The job ID for the user import job.
    */
  var JobId: js.UndefOr[UserImportJobIdType] = js.undefined
  /**
    * The job name for the user import job.
    */
  var JobName: js.UndefOr[UserImportJobNameType] = js.undefined
  /**
    * The pre-signed URL to be used to upload the .csv file.
    */
  var PreSignedUrl: js.UndefOr[PreSignedUrlType] = js.undefined
  /**
    * The number of users that were skipped.
    */
  var SkippedUsers: js.UndefOr[LongType] = js.undefined
  /**
    * The date when the user import job was started.
    */
  var StartDate: js.UndefOr[DateType] = js.undefined
  /**
    * The status of the user import job. One of the following:    Created - The job was created but not started.    Pending - A transition state. You have started the job, but it has not begun importing users yet.    InProgress - The job has started, and users are being imported.    Stopping - You have stopped the job, but the job has not stopped importing users yet.    Stopped - You have stopped the job, and the job has stopped importing users.    Succeeded - The job has completed successfully.    Failed - The job has stopped due to an error.    Expired - You created a job, but did not start the job within 24-48 hours. All data associated with the job was deleted, and the job cannot be started.  
    */
  var Status: js.UndefOr[UserImportJobStatusType] = js.undefined
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}

object UserImportJobType {
  @scala.inline
  def apply(
    CloudWatchLogsRoleArn: ArnType = null,
    CompletionDate: DateType = null,
    CompletionMessage: CompletionMessageType = null,
    CreationDate: DateType = null,
    FailedUsers: js.UndefOr[LongType] = js.undefined,
    ImportedUsers: js.UndefOr[LongType] = js.undefined,
    JobId: UserImportJobIdType = null,
    JobName: UserImportJobNameType = null,
    PreSignedUrl: PreSignedUrlType = null,
    SkippedUsers: js.UndefOr[LongType] = js.undefined,
    StartDate: DateType = null,
    Status: UserImportJobStatusType = null,
    UserPoolId: UserPoolIdType = null
  ): UserImportJobType = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogsRoleArn != null) __obj.updateDynamic("CloudWatchLogsRoleArn")(CloudWatchLogsRoleArn)
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate)
    if (CompletionMessage != null) __obj.updateDynamic("CompletionMessage")(CompletionMessage)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (!js.isUndefined(FailedUsers)) __obj.updateDynamic("FailedUsers")(FailedUsers)
    if (!js.isUndefined(ImportedUsers)) __obj.updateDynamic("ImportedUsers")(ImportedUsers)
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (PreSignedUrl != null) __obj.updateDynamic("PreSignedUrl")(PreSignedUrl)
    if (!js.isUndefined(SkippedUsers)) __obj.updateDynamic("SkippedUsers")(SkippedUsers)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId)
    __obj.asInstanceOf[UserImportJobType]
  }
}

