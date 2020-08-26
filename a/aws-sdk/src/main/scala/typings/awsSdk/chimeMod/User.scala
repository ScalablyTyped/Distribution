package typings.awsSdk.chimeMod

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
    * The Alexa for Business metadata.
    */
  var AlexaForBusinessMetadata: js.UndefOr[typings.awsSdk.chimeMod.AlexaForBusinessMetadata] = js.native
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
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typings.awsSdk.chimeMod.UserType] = js.native
}

object User {
  @scala.inline
  def apply(UserId: String): User = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
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
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setAlexaForBusinessMetadata(value: AlexaForBusinessMetadata): Self = this.set("AlexaForBusinessMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlexaForBusinessMetadata: Self = this.set("AlexaForBusinessMetadata", js.undefined)
    @scala.inline
    def setDisplayName(value: SensitiveString): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setInvitedOn(value: Iso8601Timestamp): Self = this.set("InvitedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedOn: Self = this.set("InvitedOn", js.undefined)
    @scala.inline
    def setLicenseType(value: License): Self = this.set("LicenseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseType: Self = this.set("LicenseType", js.undefined)
    @scala.inline
    def setPersonalPIN(value: String): Self = this.set("PersonalPIN", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersonalPIN: Self = this.set("PersonalPIN", js.undefined)
    @scala.inline
    def setPrimaryEmail(value: EmailAddress): Self = this.set("PrimaryEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryEmail: Self = this.set("PrimaryEmail", js.undefined)
    @scala.inline
    def setPrimaryProvisionedNumber(value: SensitiveString): Self = this.set("PrimaryProvisionedNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryProvisionedNumber: Self = this.set("PrimaryProvisionedNumber", js.undefined)
    @scala.inline
    def setRegisteredOn(value: Iso8601Timestamp): Self = this.set("RegisteredOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisteredOn: Self = this.set("RegisteredOn", js.undefined)
    @scala.inline
    def setUserInvitationStatus(value: InviteStatus): Self = this.set("UserInvitationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInvitationStatus: Self = this.set("UserInvitationStatus", js.undefined)
    @scala.inline
    def setUserRegistrationStatus(value: RegistrationStatus): Self = this.set("UserRegistrationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserRegistrationStatus: Self = this.set("UserRegistrationStatus", js.undefined)
    @scala.inline
    def setUserType(value: UserType): Self = this.set("UserType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserType: Self = this.set("UserType", js.undefined)
  }
  
}

