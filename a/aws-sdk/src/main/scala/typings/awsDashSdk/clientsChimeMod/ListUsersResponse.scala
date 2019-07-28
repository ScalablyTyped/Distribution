package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * List of users and user details.
    */
  var Users: js.UndefOr[UserList] = js.undefined
}

object ListUsersResponse {
  @scala.inline
  def apply(NextToken: String = null, Users: UserList = null): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[ListUsersResponse]
  }
}

