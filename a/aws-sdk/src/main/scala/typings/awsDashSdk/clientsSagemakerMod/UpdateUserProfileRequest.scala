package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserProfileRequest extends js.Object {
  /**
    * The domain ID.
    */
  var DomainId: typings.awsDashSdk.clientsSagemakerMod.DomainId = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: typings.awsDashSdk.clientsSagemakerMod.UserProfileName = js.native
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.UserSettings] = js.native
}

object UpdateUserProfileRequest {
  @scala.inline
  def apply(DomainId: DomainId, UserProfileName: UserProfileName, UserSettings: UserSettings = null): UpdateUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    if (UserSettings != null) __obj.updateDynamic("UserSettings")(UserSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserProfileRequest]
  }
}

