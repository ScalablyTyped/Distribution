package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserImportJobRequest extends js.Object {
  /**
    * The role ARN for the Amazon CloudWatch Logging role for the user import job.
    */
  var CloudWatchLogsRoleArn: ArnType
  /**
    * The job name for the user import job.
    */
  var JobName: UserImportJobNameType
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType
}

object CreateUserImportJobRequest {
  @scala.inline
  def apply(CloudWatchLogsRoleArn: ArnType, JobName: UserImportJobNameType, UserPoolId: UserPoolIdType): CreateUserImportJobRequest = {
    val __obj = js.Dynamic.literal(CloudWatchLogsRoleArn = CloudWatchLogsRoleArn, JobName = JobName, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[CreateUserImportJobRequest]
  }
}

