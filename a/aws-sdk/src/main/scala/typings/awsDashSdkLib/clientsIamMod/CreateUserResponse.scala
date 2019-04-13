package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserResponse extends js.Object {
  /**
    * A structure with details about the new IAM user.
    */
  var User: js.UndefOr[User] = js.undefined
}

object CreateUserResponse {
  @scala.inline
  def apply(User: User = null): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[CreateUserResponse]
  }
}

