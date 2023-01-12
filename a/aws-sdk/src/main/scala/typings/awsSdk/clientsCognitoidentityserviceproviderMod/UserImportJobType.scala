package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserImportJobType extends StObject {
  
  /**
    * The role Amazon Resource Name (ARN) for the Amazon CloudWatch Logging role for the user import job. For more information, see "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * The date when the user import job was completed.
    */
  var CompletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The message returned when the user import job is completed.
    */
  var CompletionMessage: js.UndefOr[CompletionMessageType] = js.undefined
  
  /**
    * The date the user import job was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of users that couldn't be imported.
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
  var StartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the user import job. One of the following:    Created - The job was created but not started.    Pending - A transition state. You have started the job, but it has not begun importing users yet.    InProgress - The job has started, and users are being imported.    Stopping - You have stopped the job, but the job has not stopped importing users yet.    Stopped - You have stopped the job, and the job has stopped importing users.    Succeeded - The job has completed successfully.    Failed - The job has stopped due to an error.    Expired - You created a job, but did not start the job within 24-48 hours. All data associated with the job was deleted, and the job can't be started.  
    */
  var Status: js.UndefOr[UserImportJobStatusType] = js.undefined
  
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}
object UserImportJobType {
  
  inline def apply(): UserImportJobType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserImportJobType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserImportJobType] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogsRoleArn(value: ArnType): Self = StObject.set(x, "CloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsRoleArnUndefined: Self = StObject.set(x, "CloudWatchLogsRoleArn", js.undefined)
    
    inline def setCompletionDate(value: js.Date): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
    
    inline def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
    
    inline def setCompletionMessage(value: CompletionMessageType): Self = StObject.set(x, "CompletionMessage", value.asInstanceOf[js.Any])
    
    inline def setCompletionMessageUndefined: Self = StObject.set(x, "CompletionMessage", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setFailedUsers(value: LongType): Self = StObject.set(x, "FailedUsers", value.asInstanceOf[js.Any])
    
    inline def setFailedUsersUndefined: Self = StObject.set(x, "FailedUsers", js.undefined)
    
    inline def setImportedUsers(value: LongType): Self = StObject.set(x, "ImportedUsers", value.asInstanceOf[js.Any])
    
    inline def setImportedUsersUndefined: Self = StObject.set(x, "ImportedUsers", js.undefined)
    
    inline def setJobId(value: UserImportJobIdType): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobName(value: UserImportJobNameType): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setPreSignedUrl(value: PreSignedUrlType): Self = StObject.set(x, "PreSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setPreSignedUrlUndefined: Self = StObject.set(x, "PreSignedUrl", js.undefined)
    
    inline def setSkippedUsers(value: LongType): Self = StObject.set(x, "SkippedUsers", value.asInstanceOf[js.Any])
    
    inline def setSkippedUsersUndefined: Self = StObject.set(x, "SkippedUsers", js.undefined)
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    inline def setStatus(value: UserImportJobStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
