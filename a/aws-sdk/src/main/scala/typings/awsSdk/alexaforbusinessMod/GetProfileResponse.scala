package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProfileResponse extends js.Object {
  /**
    * The details of the room profile requested. Required.
    */
  var Profile: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Profile] = js.native
}

object GetProfileResponse {
  @scala.inline
  def apply(Profile: Profile = null): GetProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (Profile != null) __obj.updateDynamic("Profile")(Profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProfileResponse]
  }
}

