package typings.auth0Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockThemeOptions extends js.Object {
  var authButtons: js.UndefOr[Auth0LockThemeButtonOptions] = js.native
  var hideMainScreenTitle: js.UndefOr[Boolean] = js.native
  var labeledSubmitButton: js.UndefOr[Boolean] = js.native
  var logo: js.UndefOr[String] = js.native
  var primaryColor: js.UndefOr[String] = js.native
}

object Auth0LockThemeOptions {
  @scala.inline
  def apply(): Auth0LockThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockThemeOptions]
  }
  @scala.inline
  implicit class Auth0LockThemeOptionsOps[Self <: Auth0LockThemeOptions] (val x: Self) extends AnyVal {
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
    def setAuthButtons(value: Auth0LockThemeButtonOptions): Self = this.set("authButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthButtons: Self = this.set("authButtons", js.undefined)
    @scala.inline
    def setHideMainScreenTitle(value: Boolean): Self = this.set("hideMainScreenTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideMainScreenTitle: Self = this.set("hideMainScreenTitle", js.undefined)
    @scala.inline
    def setLabeledSubmitButton(value: Boolean): Self = this.set("labeledSubmitButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabeledSubmitButton: Self = this.set("labeledSubmitButton", js.undefined)
    @scala.inline
    def setLogo(value: String): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryColor: Self = this.set("primaryColor", js.undefined)
  }
  
}

