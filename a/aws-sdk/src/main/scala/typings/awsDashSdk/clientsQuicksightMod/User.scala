package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /**
    * Active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an AD user, that user is inactive until they sign in and provide a password
    */
  var Active: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the user.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Arn] = js.undefined
  /**
    * The user's email address.
    */
  var Email: js.UndefOr[String] = js.undefined
  /**
    * The type of identity authentication used by the user.
    */
  var IdentityType: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.IdentityType] = js.undefined
  /**
    * The principal ID of the user.
    */
  var PrincipalId: js.UndefOr[String] = js.undefined
  /**
    * The Amazon QuickSight role for the user.
    */
  var Role: js.UndefOr[UserRole] = js.undefined
  /**
    * The user's user name.
    */
  var UserName: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.UserName] = js.undefined
}

object User {
  @scala.inline
  def apply(
    Active: js.UndefOr[Boolean] = js.undefined,
    Arn: Arn = null,
    Email: String = null,
    IdentityType: IdentityType = null,
    PrincipalId: String = null,
    Role: UserRole = null,
    UserName: UserName = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (IdentityType != null) __obj.updateDynamic("IdentityType")(IdentityType.asInstanceOf[js.Any])
    if (PrincipalId != null) __obj.updateDynamic("PrincipalId")(PrincipalId)
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[User]
  }
}

