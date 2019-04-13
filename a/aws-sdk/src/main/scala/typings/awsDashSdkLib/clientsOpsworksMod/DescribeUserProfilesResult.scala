package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserProfilesResult extends js.Object {
  /**
    * A Users object that describes the specified users.
    */
  var UserProfiles: js.UndefOr[UserProfiles] = js.undefined
}

object DescribeUserProfilesResult {
  @scala.inline
  def apply(UserProfiles: UserProfiles = null): DescribeUserProfilesResult = {
    val __obj = js.Dynamic.literal()
    if (UserProfiles != null) __obj.updateDynamic("UserProfiles")(UserProfiles)
    __obj.asInstanceOf[DescribeUserProfilesResult]
  }
}

