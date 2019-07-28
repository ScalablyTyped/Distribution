package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCurrentUserResponse extends js.Object {
  /**
    * Metadata of the user.
    */
  var User: js.UndefOr[typings.awsDashSdk.clientsWorkdocsMod.User] = js.undefined
}

object GetCurrentUserResponse {
  @scala.inline
  def apply(User: User = null): GetCurrentUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[GetCurrentUserResponse]
  }
}

