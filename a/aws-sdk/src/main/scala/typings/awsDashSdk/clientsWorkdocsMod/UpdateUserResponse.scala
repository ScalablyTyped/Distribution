package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserResponse extends js.Object {
  /**
    * The user information.
    */
  var User: js.UndefOr[typings.awsDashSdk.clientsWorkdocsMod.User] = js.undefined
}

object UpdateUserResponse {
  @scala.inline
  def apply(User: User = null): UpdateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[UpdateUserResponse]
  }
}

