package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UserProfile extends js.Object {
  /**
    * The user's full name as specified in their Google account.
    * Requires the NAME permission.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The user's last name as specified in their Google account.
    * Note that this field could be empty.
    * Requires the NAME permission.
    */
  var familyName: js.UndefOr[String] = js.undefined
  /**
    * The user's first name as specified in their Google account.
    * Requires the NAME permission.
    */
  var givenName: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UserProfile {
  @scala.inline
  def apply(displayName: String = null, familyName: String = null, givenName: String = null): GoogleActionsV2UserProfile = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UserProfile]
  }
}

