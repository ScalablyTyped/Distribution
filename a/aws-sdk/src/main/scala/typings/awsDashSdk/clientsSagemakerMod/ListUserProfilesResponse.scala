package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserProfilesResponse extends js.Object {
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.native
  /**
    * The list of user profiles.
    */
  var UserProfiles: js.UndefOr[UserProfileList] = js.native
}

object ListUserProfilesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, UserProfiles: UserProfileList = null): ListUserProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UserProfiles != null) __obj.updateDynamic("UserProfiles")(UserProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserProfilesResponse]
  }
}

