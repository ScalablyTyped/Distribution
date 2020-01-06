package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateUserResponse extends js.Object {
  /**
    * If the BatchUpdateUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
    */
  var UserErrors: js.UndefOr[UserErrorList] = js.native
}

object BatchUpdateUserResponse {
  @scala.inline
  def apply(UserErrors: UserErrorList = null): BatchUpdateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (UserErrors != null) __obj.updateDynamic("UserErrors")(UserErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateUserResponse]
  }
}

