package typings.alexaDashSdk.alexaDashSdkMod

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
    val __obj = js.Dynamic.literal(permissions = permissions, userId = userId)
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    __obj.asInstanceOf[SessionUser]
  }
}

