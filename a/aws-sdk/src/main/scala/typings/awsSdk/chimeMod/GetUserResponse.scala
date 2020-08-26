package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserResponse extends js.Object {
  /**
    * The user details.
    */
  var User: js.UndefOr[typings.awsSdk.chimeMod.User] = js.native
}

object GetUserResponse {
  @scala.inline
  def apply(): GetUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserResponse]
  }
  @scala.inline
  implicit class GetUserResponseOps[Self <: GetUserResponse] (val x: Self) extends AnyVal {
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
    def setUser(value: User): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
  
}

