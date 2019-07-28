package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersResponse extends js.Object {
  /**
    *  The token to use to retrieve the next page of results. This value is `null` when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.undefined
  /**
    * The overview of users for an organization.
    */
  var Users: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.Users] = js.undefined
}

object ListUsersResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Users: Users = null): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[ListUsersResponse]
  }
}

