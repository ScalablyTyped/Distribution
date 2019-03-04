package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionUser extends js.Object {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var permissions: Permissions
  var userId: java.lang.String
}

object SessionUser {
  @scala.inline
  def apply(permissions: Permissions, userId: java.lang.String, accessToken: java.lang.String = null): SessionUser = {
    val __obj = js.Dynamic.literal(permissions = permissions, userId = userId)
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    __obj.asInstanceOf[SessionUser]
  }
}

