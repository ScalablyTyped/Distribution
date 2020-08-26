package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserStackAssociationError extends js.Object {
  /**
    * The error code for the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  var ErrorCode: js.UndefOr[UserStackAssociationErrorCode] = js.native
  /**
    * The error message for the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * Information about the user and associated stack.
    */
  var UserStackAssociation: js.UndefOr[typings.awsSdk.appstreamMod.UserStackAssociation] = js.native
}

object UserStackAssociationError {
  @scala.inline
  def apply(): UserStackAssociationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserStackAssociationError]
  }
  @scala.inline
  implicit class UserStackAssociationErrorOps[Self <: UserStackAssociationError] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: UserStackAssociationErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setUserStackAssociation(value: UserStackAssociation): Self = this.set("UserStackAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserStackAssociation: Self = this.set("UserStackAssociation", js.undefined)
  }
  
}

