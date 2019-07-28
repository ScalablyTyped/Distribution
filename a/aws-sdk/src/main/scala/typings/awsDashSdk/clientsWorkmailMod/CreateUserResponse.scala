package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserResponse extends js.Object {
  /**
    * The identifier for the new user.
    */
  var UserId: js.UndefOr[WorkMailIdentifier] = js.undefined
}

object CreateUserResponse {
  @scala.inline
  def apply(UserId: WorkMailIdentifier = null): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    __obj.asInstanceOf[CreateUserResponse]
  }
}

