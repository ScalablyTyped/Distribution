package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3UserInfo extends js.Object {
  /**
    * Display name of the user, might be different from first or last name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * User email, Eg: janedoe@gmail.com.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * First name of the user.
    */
  var firstName: js.UndefOr[String] = js.native
  /**
    * Last name of the user.
    */
  var lastName: js.UndefOr[String] = js.native
  /**
    * Phone numbers of the user.
    */
  var phoneNumbers: js.UndefOr[js.Array[GoogleActionsOrdersV3PhoneNumber]] = js.native
}

object GoogleActionsOrdersV3UserInfo {
  @scala.inline
  def apply(): GoogleActionsOrdersV3UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3UserInfo]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3UserInfoOps[Self <: GoogleActionsOrdersV3UserInfo] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    @scala.inline
    def setPhoneNumbersVarargs(value: GoogleActionsOrdersV3PhoneNumber*): Self = this.set("phoneNumbers", js.Array(value :_*))
    @scala.inline
    def setPhoneNumbers(value: js.Array[GoogleActionsOrdersV3PhoneNumber]): Self = this.set("phoneNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumbers: Self = this.set("phoneNumbers", js.undefined)
  }
  
}

