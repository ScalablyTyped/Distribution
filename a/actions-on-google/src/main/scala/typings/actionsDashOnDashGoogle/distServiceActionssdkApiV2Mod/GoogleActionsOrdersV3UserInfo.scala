package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3UserInfo extends js.Object {
  /**
    * Display name of the user, might be different from first or last name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * User email, Eg: janedoe@gmail.com.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * First name of the user.
    */
  var firstName: js.UndefOr[String] = js.undefined
  /**
    * Last name of the user.
    */
  var lastName: js.UndefOr[String] = js.undefined
  /**
    * Phone numbers of the user.
    */
  var phoneNumbers: js.UndefOr[js.Array[GoogleActionsOrdersV3PhoneNumber]] = js.undefined
}

object GoogleActionsOrdersV3UserInfo {
  @scala.inline
  def apply(
    displayName: String = null,
    email: String = null,
    firstName: String = null,
    lastName: String = null,
    phoneNumbers: js.Array[GoogleActionsOrdersV3PhoneNumber] = null
  ): GoogleActionsOrdersV3UserInfo = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (phoneNumbers != null) __obj.updateDynamic("phoneNumbers")(phoneNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3UserInfo]
  }
}

