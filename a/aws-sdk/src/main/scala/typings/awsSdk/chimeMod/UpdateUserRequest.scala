package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The Alexa for Business metadata.
    */
  var AlexaForBusinessMetadata: js.UndefOr[typings.awsSdk.chimeMod.AlexaForBusinessMetadata] = js.native
  /**
    * The user license type to update. This must be a supported license type for the Amazon Chime account that the user belongs to.
    */
  var LicenseType: js.UndefOr[License] = js.native
  /**
    * The user ID.
    */
  var UserId: NonEmptyString = js.native
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typings.awsSdk.chimeMod.UserType] = js.native
}

object UpdateUserRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserId: NonEmptyString): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  @scala.inline
  implicit class UpdateUserRequestOps[Self <: UpdateUserRequest] (val x: Self) extends AnyVal {
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
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: NonEmptyString): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlexaForBusinessMetadata(value: AlexaForBusinessMetadata): Self = this.set("AlexaForBusinessMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlexaForBusinessMetadata: Self = this.set("AlexaForBusinessMetadata", js.undefined)
    @scala.inline
    def setLicenseType(value: License): Self = this.set("LicenseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseType: Self = this.set("LicenseType", js.undefined)
    @scala.inline
    def setUserType(value: UserType): Self = this.set("UserType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserType: Self = this.set("UserType", js.undefined)
  }
  
}

