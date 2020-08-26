package typings.auth0.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Email extends js.Object {
  var email: js.UndefOr[String] = js.native
  var email_verified: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var phone_number: js.UndefOr[String] = js.native
  var phone_verified: js.UndefOr[Boolean] = js.native
  var request_language: js.UndefOr[String] = js.native
}

object Email {
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmail_verified(value: Boolean): Self = this.set("email_verified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail_verified: Self = this.set("email_verified", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone_number: Self = this.set("phone_number", js.undefined)
    @scala.inline
    def setPhone_verified(value: Boolean): Self = this.set("phone_verified", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone_verified: Self = this.set("phone_verified", js.undefined)
    @scala.inline
    def setRequest_language(value: String): Self = this.set("request_language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_language: Self = this.set("request_language", js.undefined)
  }
  
}

