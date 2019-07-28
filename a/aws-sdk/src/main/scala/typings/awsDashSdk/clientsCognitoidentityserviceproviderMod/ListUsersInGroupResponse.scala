package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersInGroupResponse extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
  /**
    * The users returned in the request to list users.
    */
  var Users: js.UndefOr[UsersListType] = js.undefined
}

object ListUsersInGroupResponse {
  @scala.inline
  def apply(NextToken: PaginationKey = null, Users: UsersListType = null): ListUsersInGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[ListUsersInGroupResponse]
  }
}

