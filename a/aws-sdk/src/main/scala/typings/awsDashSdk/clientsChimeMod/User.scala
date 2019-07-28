package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  /**
    * The display name of the user.
    */
  var DisplayName: js.UndefOr[SensitiveString] = js.undefined
  /**
    * Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
    */
  var InvitedOn: js.UndefOr[Iso8601Timestamp] = js.undefined
  /**
    * The license type for the user.
    */
  var LicenseType: js.UndefOr[License] = js.undefined
  /**
    * The user's personal meeting PIN.
    */
  var PersonalPIN: js.UndefOr[String] = js.undefined
  /**
    * The primary email address of the user.
    */
  var PrimaryEmail: js.UndefOr[EmailAddress] = js.undefined
  /**
    * The primary phone number associated with the user.
    */
  var PrimaryProvisionedNumber: js.UndefOr[SensitiveString] = js.undefined
  /**
    * Date and time when the user is registered, in ISO 8601 format.
    */
  var RegisteredOn: js.UndefOr[Iso8601Timestamp] = js.undefined
  /**
    * The user ID.
    */
  var UserId: String
  /**
    * The user invite status.
    */
  var UserInvitationStatus: js.UndefOr[InviteStatus] = js.undefined
  /**
    * The user registration status.
    */
  var UserRegistrationStatus: js.UndefOr[RegistrationStatus] = js.undefined
}

object User {
  @scala.inline
  def apply(
    UserId: String,
    AccountId: String = null,
    DisplayName: SensitiveString = null,
    InvitedOn: Iso8601Timestamp = null,
    LicenseType: License = null,
    PersonalPIN: String = null,
    PrimaryEmail: EmailAddress = null,
    PrimaryProvisionedNumber: SensitiveString = null,
    RegisteredOn: Iso8601Timestamp = null,
    UserInvitationStatus: InviteStatus = null,
    UserRegistrationStatus: RegistrationStatus = null
  ): User = {
    val __obj = js.Dynamic.literal(UserId = UserId)
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (InvitedOn != null) __obj.updateDynamic("InvitedOn")(InvitedOn)
    if (LicenseType != null) __obj.updateDynamic("LicenseType")(LicenseType.asInstanceOf[js.Any])
    if (PersonalPIN != null) __obj.updateDynamic("PersonalPIN")(PersonalPIN)
    if (PrimaryEmail != null) __obj.updateDynamic("PrimaryEmail")(PrimaryEmail)
    if (PrimaryProvisionedNumber != null) __obj.updateDynamic("PrimaryProvisionedNumber")(PrimaryProvisionedNumber)
    if (RegisteredOn != null) __obj.updateDynamic("RegisteredOn")(RegisteredOn)
    if (UserInvitationStatus != null) __obj.updateDynamic("UserInvitationStatus")(UserInvitationStatus.asInstanceOf[js.Any])
    if (UserRegistrationStatus != null) __obj.updateDynamic("UserRegistrationStatus")(UserRegistrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

