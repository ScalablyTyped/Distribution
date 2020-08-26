package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserIDsResponse extends js.Object {
  /**
    * List of users id.
    */
  var userIDs: js.Array[UserIDResponse] = js.native
}

object ListUserIDsResponse {
  @scala.inline
  def apply(userIDs: js.Array[UserIDResponse]): ListUserIDsResponse = {
    val __obj = js.Dynamic.literal(userIDs = userIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserIDsResponse]
  }
  @scala.inline
  implicit class ListUserIDsResponseOps[Self <: ListUserIDsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUserIDsVarargs(value: UserIDResponse*): Self = this.set("userIDs", js.Array(value :_*))
    @scala.inline
    def setUserIDs(value: js.Array[UserIDResponse]): Self = this.set("userIDs", value.asInstanceOf[js.Any])
  }
  
}

