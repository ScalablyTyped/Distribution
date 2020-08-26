package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsersResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * List of users and user details.
    */
  var Users: js.UndefOr[UserList] = js.native
}

object ListUsersResponse {
  @scala.inline
  def apply(): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsersResponse]
  }
  @scala.inline
  implicit class ListUsersResponseOps[Self <: ListUsersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setUsersVarargs(value: User*): Self = this.set("Users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: UserList): Self = this.set("Users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
  
}

