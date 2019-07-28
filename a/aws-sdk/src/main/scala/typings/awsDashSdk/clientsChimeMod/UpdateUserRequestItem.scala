package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserRequestItem extends js.Object {
  /**
    * The user license type.
    */
  var LicenseType: js.UndefOr[License] = js.undefined
  /**
    * The user ID.
    */
  var UserId: NonEmptyString
}

object UpdateUserRequestItem {
  @scala.inline
  def apply(UserId: NonEmptyString, LicenseType: License = null): UpdateUserRequestItem = {
    val __obj = js.Dynamic.literal(UserId = UserId)
    if (LicenseType != null) __obj.updateDynamic("LicenseType")(LicenseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequestItem]
  }
}

