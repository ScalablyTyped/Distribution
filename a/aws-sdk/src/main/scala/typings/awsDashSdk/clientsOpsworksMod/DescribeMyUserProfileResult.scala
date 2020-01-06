package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMyUserProfileResult extends js.Object {
  /**
    * A UserProfile object that describes the user's SSH information.
    */
  var UserProfile: js.UndefOr[SelfUserProfile] = js.native
}

object DescribeMyUserProfileResult {
  @scala.inline
  def apply(UserProfile: SelfUserProfile = null): DescribeMyUserProfileResult = {
    val __obj = js.Dynamic.literal()
    if (UserProfile != null) __obj.updateDynamic("UserProfile")(UserProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMyUserProfileResult]
  }
}

