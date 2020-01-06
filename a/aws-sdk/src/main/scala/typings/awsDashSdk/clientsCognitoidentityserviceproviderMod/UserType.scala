package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserType extends js.Object {
  /**
    * A container with information about the user type attributes.
    */
  var Attributes: js.UndefOr[AttributeListType] = js.native
  /**
    * Specifies whether the user is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  /**
    * The MFA options for the user.
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.native
  /**
    * The creation date of the user.
    */
  var UserCreateDate: js.UndefOr[DateType] = js.native
  /**
    * The last modified date of the user.
    */
  var UserLastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The user status. Can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   ARCHIVED - User is no longer active.   COMPROMISED - User is disabled due to a potential security threat.   UNKNOWN - User status is not known.   RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or she can sign in.   FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first sign-in, the user must change his or her password to a new value before doing anything else.   
    */
  var UserStatus: js.UndefOr[UserStatusType] = js.native
  /**
    * The user name of the user you wish to describe.
    */
  var Username: js.UndefOr[UsernameType] = js.native
}

object UserType {
  @scala.inline
  def apply(
    Attributes: AttributeListType = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    MFAOptions: MFAOptionListType = null,
    UserCreateDate: DateType = null,
    UserLastModifiedDate: DateType = null,
    UserStatus: UserStatusType = null,
    Username: UsernameType = null
  ): UserType = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (MFAOptions != null) __obj.updateDynamic("MFAOptions")(MFAOptions.asInstanceOf[js.Any])
    if (UserCreateDate != null) __obj.updateDynamic("UserCreateDate")(UserCreateDate.asInstanceOf[js.Any])
    if (UserLastModifiedDate != null) __obj.updateDynamic("UserLastModifiedDate")(UserLastModifiedDate.asInstanceOf[js.Any])
    if (UserStatus != null) __obj.updateDynamic("UserStatus")(UserStatus.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserType]
  }
}

