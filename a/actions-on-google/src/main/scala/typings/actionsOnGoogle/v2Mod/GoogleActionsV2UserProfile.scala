package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UserProfile extends js.Object {
  /**
    * The user's full name as specified in their Google account.
    * Requires the NAME permission.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The user's last name as specified in their Google account.
    * Note that this field could be empty.
    * Requires the NAME permission.
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * The user's first name as specified in their Google account.
    * Requires the NAME permission.
    */
  var givenName: js.UndefOr[String] = js.native
}

object GoogleActionsV2UserProfile {
  @scala.inline
  def apply(): GoogleActionsV2UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UserProfile]
  }
  @scala.inline
  implicit class GoogleActionsV2UserProfileOps[Self <: GoogleActionsV2UserProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
  }
  
}

