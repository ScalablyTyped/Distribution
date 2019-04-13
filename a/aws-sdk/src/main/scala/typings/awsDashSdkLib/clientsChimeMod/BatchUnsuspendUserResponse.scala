package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUnsuspendUserResponse extends js.Object {
  /**
    * If the BatchUnsuspendUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
    */
  var UserErrors: js.UndefOr[UserErrorList] = js.undefined
}

object BatchUnsuspendUserResponse {
  @scala.inline
  def apply(UserErrors: UserErrorList = null): BatchUnsuspendUserResponse = {
    val __obj = js.Dynamic.literal()
    if (UserErrors != null) __obj.updateDynamic("UserErrors")(UserErrors)
    __obj.asInstanceOf[BatchUnsuspendUserResponse]
  }
}

