package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserProfileResponse extends js.Object {
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.UserProfileArn] = js.native
}

object UpdateUserProfileResponse {
  @scala.inline
  def apply(UserProfileArn: UserProfileArn = null): UpdateUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (UserProfileArn != null) __obj.updateDynamic("UserProfileArn")(UserProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserProfileResponse]
  }
}

