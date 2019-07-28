package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersResponse extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
  /**
    * The users returned in the request to list users.
    */
  var Users: js.UndefOr[UsersListType] = js.undefined
}

object ListUsersResponse {
  @scala.inline
  def apply(PaginationToken: SearchPaginationTokenType = null, Users: UsersListType = null): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[ListUsersResponse]
  }
}

