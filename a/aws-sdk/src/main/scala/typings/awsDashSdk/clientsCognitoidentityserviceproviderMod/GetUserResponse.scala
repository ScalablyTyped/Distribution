package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserResponse extends js.Object {
  /**
    * Specifies the options for MFA (e.g., email or phone number).
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined
  /**
    * The user's preferred MFA setting.
    */
  var PreferredMfaSetting: js.UndefOr[StringType] = js.undefined
  /**
    * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributes: AttributeListType
  /**
    * The list of the user's MFA settings.
    */
  var UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.undefined
  /**
    * The user name of the user you wish to retrieve from the get user request.
    */
  var Username: UsernameType
}

object GetUserResponse {
  @scala.inline
  def apply(
    UserAttributes: AttributeListType,
    Username: UsernameType,
    MFAOptions: MFAOptionListType = null,
    PreferredMfaSetting: StringType = null,
    UserMFASettingList: UserMFASettingListType = null
  ): GetUserResponse = {
    val __obj = js.Dynamic.literal(UserAttributes = UserAttributes, Username = Username)
    if (MFAOptions != null) __obj.updateDynamic("MFAOptions")(MFAOptions)
    if (PreferredMfaSetting != null) __obj.updateDynamic("PreferredMfaSetting")(PreferredMfaSetting)
    if (UserMFASettingList != null) __obj.updateDynamic("UserMFASettingList")(UserMFASettingList)
    __obj.asInstanceOf[GetUserResponse]
  }
}

