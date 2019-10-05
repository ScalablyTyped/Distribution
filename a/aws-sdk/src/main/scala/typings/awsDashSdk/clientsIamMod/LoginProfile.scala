package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginProfile extends js.Object {
  /**
    * The date when the password for the user was created.
    */
  var CreateDate: dateType
  /**
    * Specifies whether the user is required to set a new password on next sign-in.
    */
  var PasswordResetRequired: js.UndefOr[booleanType] = js.undefined
  /**
    * The name of the user, which can be used for signing in to the AWS Management Console.
    */
  var UserName: userNameType
}

object LoginProfile {
  @scala.inline
  def apply(
    CreateDate: dateType,
    UserName: userNameType,
    PasswordResetRequired: js.UndefOr[Boolean] = js.undefined
  ): LoginProfile = {
    val __obj = js.Dynamic.literal(CreateDate = CreateDate, UserName = UserName)
    if (!js.isUndefined(PasswordResetRequired)) __obj.updateDynamic("PasswordResetRequired")(PasswordResetRequired)
    __obj.asInstanceOf[LoginProfile]
  }
}

