package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserResponse extends js.Object {
  /**
    * The user details.
    */
  var User: js.UndefOr[User] = js.undefined
}

object GetUserResponse {
  @scala.inline
  def apply(User: User = null): GetUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[GetUserResponse]
  }
}

