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
  def apply(
    AccountId: NonEmptyString,
    UserId: NonEmptyString,
    AlexaForBusinessMetadata: AlexaForBusinessMetadata = null,
    LicenseType: License = null,
    UserType: UserType = null
  ): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    if (AlexaForBusinessMetadata != null) __obj.updateDynamic("AlexaForBusinessMetadata")(AlexaForBusinessMetadata.asInstanceOf[js.Any])
    if (LicenseType != null) __obj.updateDynamic("LicenseType")(LicenseType.asInstanceOf[js.Any])
    if (UserType != null) __obj.updateDynamic("UserType")(UserType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
}

