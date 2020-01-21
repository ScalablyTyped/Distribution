package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionUser extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var permissions: Permissions
  var userId: String
}

object SessionUser {
  @scala.inline
  def apply(permissions: Permissions, userId: String, accessToken: String = null): SessionUser = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionUser]
  }
}

