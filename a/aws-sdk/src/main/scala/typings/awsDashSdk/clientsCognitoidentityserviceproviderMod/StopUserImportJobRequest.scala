package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopUserImportJobRequest extends js.Object {
  /**
    * The job ID for the user import job.
    */
  var JobId: UserImportJobIdType = js.native
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object StopUserImportJobRequest {
  @scala.inline
  def apply(JobId: UserImportJobIdType, UserPoolId: UserPoolIdType): StopUserImportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopUserImportJobRequest]
  }
}

