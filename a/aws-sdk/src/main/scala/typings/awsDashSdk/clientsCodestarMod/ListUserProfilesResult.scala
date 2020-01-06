package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserProfilesResult extends js.Object {
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * All the user profiles configured in AWS CodeStar for an AWS account.
    */
  var userProfiles: UserProfilesList = js.native
}

object ListUserProfilesResult {
  @scala.inline
  def apply(userProfiles: UserProfilesList, nextToken: PaginationToken = null): ListUserProfilesResult = {
    val __obj = js.Dynamic.literal(userProfiles = userProfiles.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserProfilesResult]
  }
}

