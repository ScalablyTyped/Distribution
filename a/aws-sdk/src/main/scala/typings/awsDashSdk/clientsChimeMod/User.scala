package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * The display name of the user.
    */
  var DisplayName: js.UndefOr[SensitiveString] = js.native
  /**
    * Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
    */
  var InvitedOn: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The license type for the user.
    */
  var LicenseType: js.UndefOr[License] = js.native
  /**
    * The user's personal meeting PIN.
    */
  var PersonalPIN: js.UndefOr[String] = js.native
  /**
    * The primary email address of the user.
    */
  var PrimaryEmail: js.UndefOr[EmailAddress] = js.native
  /**
    * The primary phone number associated with the user.
    */
  var PrimaryProvisionedNumber: js.UndefOr[SensitiveString] = js.native
  /**
    * Date and time when the user is registered, in ISO 8601 format.
    */
  var RegisteredOn: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The user ID.
    */
  var UserId: String = js.native
  /**
    * The user invite status.
    */
  var UserInvitationStatus: js.UndefOr[InviteStatus] = js.native
  /**
    * The user registration status.
    */
  var UserRegistrationStatus: js.UndefOr[RegistrationStatus] = js.native
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
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (InvitedOn != null) __obj.updateDynamic("InvitedOn")(InvitedOn.asInstanceOf[js.Any])
    if (LicenseType != null) __obj.updateDynamic("LicenseType")(LicenseType.asInstanceOf[js.Any])
    if (PersonalPIN != null) __obj.updateDynamic("PersonalPIN")(PersonalPIN.asInstanceOf[js.Any])
    if (PrimaryEmail != null) __obj.updateDynamic("PrimaryEmail")(PrimaryEmail.asInstanceOf[js.Any])
    if (PrimaryProvisionedNumber != null) __obj.updateDynamic("PrimaryProvisionedNumber")(PrimaryProvisionedNumber.asInstanceOf[js.Any])
    if (RegisteredOn != null) __obj.updateDynamic("RegisteredOn")(RegisteredOn.asInstanceOf[js.Any])
    if (UserInvitationStatus != null) __obj.updateDynamic("UserInvitationStatus")(UserInvitationStatus.asInstanceOf[js.Any])
    if (UserRegistrationStatus != null) __obj.updateDynamic("UserRegistrationStatus")(UserRegistrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

