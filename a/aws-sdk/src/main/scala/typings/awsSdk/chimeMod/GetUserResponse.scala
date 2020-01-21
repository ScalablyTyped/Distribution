package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserResponse extends js.Object {
  /**
    * The user details.
    */
  var User: js.UndefOr[typings.awsSdk.chimeMod.User] = js.native
}

object GetUserResponse {
  @scala.inline
  def apply(User: User = null): GetUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserResponse]
  }
}

