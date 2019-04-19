package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminGetUserResponse extends js.Object {
  /**
    * Indicates that the status is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.undefined
  /**
    * Specifies the options for MFA (e.g., email or phone number).
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined
  /**
    * The user's preferred MFA setting.
    */
  var PreferredMfaSetting: js.UndefOr[StringType] = js.undefined
  /**
    * An array of name-value pairs representing user attributes.
    */
  var UserAttributes: js.UndefOr[AttributeListType] = js.undefined
  /**
    * The date the user was created.
    */
  var UserCreateDate: js.UndefOr[DateType] = js.undefined
  /**
    * The date the user was last modified.
    */
  var UserLastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The list of the user's MFA settings.
    */
  var UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.undefined
  /**
    * The user status. Can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   ARCHIVED - User is no longer active.   COMPROMISED - User is disabled due to a potential security threat.   UNKNOWN - User status is not known.   RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or she can sign in.   FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first sign-in, the user must change his or her password to a new value before doing anything else.   
    */
  var UserStatus: js.UndefOr[UserStatusType] = js.undefined
  /**
    * The user name of the user about whom you are receiving information.
    */
  var Username: UsernameType
}

object AdminGetUserResponse {
  @scala.inline
  def apply(
    Username: UsernameType,
    Enabled: js.UndefOr[BooleanType] = js.undefined,
    MFAOptions: MFAOptionListType = null,
    PreferredMfaSetting: StringType = null,
    UserAttributes: AttributeListType = null,
    UserCreateDate: DateType = null,
    UserLastModifiedDate: DateType = null,
    UserMFASettingList: UserMFASettingListType = null,
    UserStatus: UserStatusType = null
  ): AdminGetUserResponse = {
    val __obj = js.Dynamic.literal(Username = Username)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (MFAOptions != null) __obj.updateDynamic("MFAOptions")(MFAOptions)
    if (PreferredMfaSetting != null) __obj.updateDynamic("PreferredMfaSetting")(PreferredMfaSetting)
    if (UserAttributes != null) __obj.updateDynamic("UserAttributes")(UserAttributes)
    if (UserCreateDate != null) __obj.updateDynamic("UserCreateDate")(UserCreateDate)
    if (UserLastModifiedDate != null) __obj.updateDynamic("UserLastModifiedDate")(UserLastModifiedDate)
    if (UserMFASettingList != null) __obj.updateDynamic("UserMFASettingList")(UserMFASettingList)
    if (UserStatus != null) __obj.updateDynamic("UserStatus")(UserStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminGetUserResponse]
  }
}

