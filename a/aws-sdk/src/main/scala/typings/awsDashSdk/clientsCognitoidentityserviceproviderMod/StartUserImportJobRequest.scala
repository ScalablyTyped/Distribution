package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartUserImportJobRequest extends js.Object {
  /**
    * The job ID for the user import job.
    */
  var JobId: UserImportJobIdType
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType
}

object StartUserImportJobRequest {
  @scala.inline
  def apply(JobId: UserImportJobIdType, UserPoolId: UserPoolIdType): StartUserImportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[StartUserImportJobRequest]
  }
}

