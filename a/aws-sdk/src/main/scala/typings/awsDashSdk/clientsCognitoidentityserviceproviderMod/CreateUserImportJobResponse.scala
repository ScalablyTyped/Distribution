package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserImportJobResponse extends js.Object {
  /**
    * The job object that represents the user import job.
    */
  var UserImportJob: js.UndefOr[UserImportJobType] = js.native
}

object CreateUserImportJobResponse {
  @scala.inline
  def apply(UserImportJob: UserImportJobType = null): CreateUserImportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (UserImportJob != null) __obj.updateDynamic("UserImportJob")(UserImportJob.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserImportJobResponse]
  }
}

