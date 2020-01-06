package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProfileRequest extends js.Object {
  /**
    * The ARN of the room profile to delete. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
}

object DeleteProfileRequest {
  @scala.inline
  def apply(ProfileArn: Arn = null): DeleteProfileRequest = {
    val __obj = js.Dynamic.literal()
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProfileRequest]
  }
}

