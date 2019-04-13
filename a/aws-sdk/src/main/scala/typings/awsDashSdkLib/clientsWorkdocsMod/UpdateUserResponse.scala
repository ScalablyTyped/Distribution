package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserResponse extends js.Object {
  /**
    * The user information.
    */
  var User: js.UndefOr[User] = js.undefined
}

object UpdateUserResponse {
  @scala.inline
  def apply(User: User = null): UpdateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[UpdateUserResponse]
  }
}

