package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserType extends js.Object {
  /**
    * A container with information about the user type attributes.
    */
  var Attributes: js.UndefOr[AttributeListType] = js.undefined
  /**
    * Specifies whether the user is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.undefined
  /**
    * The MFA options for the user.
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined
  /**
    * The creation date of the user.
    */
  var UserCreateDate: js.UndefOr[DateType] = js.undefined
  /**
    * The last modified date of the user.
    */
  var UserLastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The user status. Can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   ARCHIVED - User is no longer active.   COMPROMISED - User is disabled due to a potential security threat.   UNKNOWN - User status is not known.  
    */
  var UserStatus: js.UndefOr[UserStatusType] = js.undefined
  /**
    * The user name of the user you wish to describe.
    */
  var Username: js.UndefOr[UsernameType] = js.undefined
}

object UserType {
  @scala.inline
  def apply(
    Attributes: AttributeListType = null,
    Enabled: js.UndefOr[BooleanType] = js.undefined,
    MFAOptions: MFAOptionListType = null,
    UserCreateDate: DateType = null,
    UserLastModifiedDate: DateType = null,
    UserStatus: UserStatusType = null,
    Username: UsernameType = null
  ): UserType = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (MFAOptions != null) __obj.updateDynamic("MFAOptions")(MFAOptions)
    if (UserCreateDate != null) __obj.updateDynamic("UserCreateDate")(UserCreateDate)
    if (UserLastModifiedDate != null) __obj.updateDynamic("UserLastModifiedDate")(UserLastModifiedDate)
    if (UserStatus != null) __obj.updateDynamic("UserStatus")(UserStatus.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[UserType]
  }
}

