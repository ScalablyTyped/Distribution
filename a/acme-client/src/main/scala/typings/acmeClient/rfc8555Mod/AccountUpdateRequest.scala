package typings.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUpdateRequest extends js.Object {
  var contact: js.UndefOr[js.Array[String]] = js.native
  var status: js.UndefOr[String] = js.native
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.native
}

object AccountUpdateRequest {
  @scala.inline
  def apply(): AccountUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUpdateRequest]
  }
  @scala.inline
  implicit class AccountUpdateRequestOps[Self <: AccountUpdateRequest] (val x: Self) extends AnyVal {
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
    def setContactVarargs(value: String*): Self = this.set("contact", js.Array(value :_*))
    @scala.inline
    def setContact(value: js.Array[String]): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTermsOfServiceAgreed(value: Boolean): Self = this.set("termsOfServiceAgreed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermsOfServiceAgreed: Self = this.set("termsOfServiceAgreed", js.undefined)
  }
  
}

