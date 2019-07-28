package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStackAssociationError extends js.Object {
  /**
    * The error code for the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  var ErrorCode: js.UndefOr[UserStackAssociationErrorCode] = js.undefined
  /**
    * The error message for the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * Information about the user and associated stack.
    */
  var UserStackAssociation: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.UserStackAssociation] = js.undefined
}

object UserStackAssociationError {
  @scala.inline
  def apply(
    ErrorCode: UserStackAssociationErrorCode = null,
    ErrorMessage: String = null,
    UserStackAssociation: UserStackAssociation = null
  ): UserStackAssociationError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (UserStackAssociation != null) __obj.updateDynamic("UserStackAssociation")(UserStackAssociation)
    __obj.asInstanceOf[UserStackAssociationError]
  }
}

