package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserResponse extends js.Object {
  /**
    * The identifier for the new user.
    */
  var UserId: js.UndefOr[WorkMailIdentifier] = js.native
}

object CreateUserResponse {
  @scala.inline
  def apply(UserId: WorkMailIdentifier = null): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserResponse]
  }
}

