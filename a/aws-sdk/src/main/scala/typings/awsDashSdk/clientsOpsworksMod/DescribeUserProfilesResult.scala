package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserProfilesResult extends js.Object {
  /**
    * A Users object that describes the specified users.
    */
  var UserProfiles: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.UserProfiles] = js.native
}

object DescribeUserProfilesResult {
  @scala.inline
  def apply(UserProfiles: UserProfiles = null): DescribeUserProfilesResult = {
    val __obj = js.Dynamic.literal()
    if (UserProfiles != null) __obj.updateDynamic("UserProfiles")(UserProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserProfilesResult]
  }
}

