package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRequestItem extends js.Object {
  /**
    * The Alexa for Business metadata.
    */
  var AlexaForBusinessMetadata: js.UndefOr[typings.awsSdk.chimeMod.AlexaForBusinessMetadata] = js.native
  /**
    * The user license type.
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

object UpdateUserRequestItem {
  @scala.inline
  def apply(
    UserId: NonEmptyString,
    AlexaForBusinessMetadata: AlexaForBusinessMetadata = null,
    LicenseType: License = null,
    UserType: UserType = null
  ): UpdateUserRequestItem = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    if (AlexaForBusinessMetadata != null) __obj.updateDynamic("AlexaForBusinessMetadata")(AlexaForBusinessMetadata.asInstanceOf[js.Any])
    if (LicenseType != null) __obj.updateDynamic("LicenseType")(LicenseType.asInstanceOf[js.Any])
    if (UserType != null) __obj.updateDynamic("UserType")(UserType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequestItem]
  }
}

