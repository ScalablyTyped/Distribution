package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The user license type to update. This must be a supported license type for the Amazon Chime account that the user belongs to.
    */
  var LicenseType: js.UndefOr[License] = js.undefined
  /**
    * The user ID.
    */
  var UserId: NonEmptyString
}

object UpdateUserRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserId: NonEmptyString, LicenseType: License = null): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, UserId = UserId)
    if (LicenseType != null) __obj.updateDynamic("LicenseType")(LicenseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
}

