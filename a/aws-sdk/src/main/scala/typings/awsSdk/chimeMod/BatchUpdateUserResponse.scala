package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateUserResponse extends js.Object {
  /**
    * If the BatchUpdateUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
    */
  var UserErrors: js.UndefOr[UserErrorList] = js.native
}

object BatchUpdateUserResponse {
  @scala.inline
  def apply(): BatchUpdateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateUserResponse]
  }
  @scala.inline
  implicit class BatchUpdateUserResponseOps[Self <: BatchUpdateUserResponse] (val x: Self) extends AnyVal {
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
    def setUserErrorsVarargs(value: UserError*): Self = this.set("UserErrors", js.Array(value :_*))
    @scala.inline
    def setUserErrors(value: UserErrorList): Self = this.set("UserErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserErrors: Self = this.set("UserErrors", js.undefined)
  }
  
}

