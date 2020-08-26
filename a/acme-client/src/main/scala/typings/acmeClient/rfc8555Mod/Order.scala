package typings.acmeClient.rfc8555Mod

import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.processing
import typings.acmeClient.acmeClientStrings.ready
import typings.acmeClient.acmeClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Order extends js.Object {
  var authorizations: js.Array[String] = js.native
  var certificate: js.UndefOr[String] = js.native
  var error: js.UndefOr[js.Object] = js.native
  var expires: js.UndefOr[String] = js.native
  @JSName("finalize")
  var finalize_FOrder: String = js.native
  var identifiers: js.Array[Identifier] = js.native
  var notAfter: js.UndefOr[String] = js.native
  var notBefore: js.UndefOr[String] = js.native
  var status: pending | ready | processing | valid | invalid = js.native
}

object Order {
  @scala.inline
  def apply(
    authorizations: js.Array[String],
    finalize: String,
    identifiers: js.Array[Identifier],
    status: pending | ready | processing | valid | invalid
  ): Order = {
    val __obj = js.Dynamic.literal(authorizations = authorizations.asInstanceOf[js.Any], finalize = finalize.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  @scala.inline
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
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
    def setAuthorizationsVarargs(value: String*): Self = this.set("authorizations", js.Array(value :_*))
    @scala.inline
    def setAuthorizations(value: js.Array[String]): Self = this.set("authorizations", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalize(value: String): Self = this.set("finalize", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifiersVarargs(value: Identifier*): Self = this.set("identifiers", js.Array(value :_*))
    @scala.inline
    def setIdentifiers(value: js.Array[Identifier]): Self = this.set("identifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: pending | ready | processing | valid | invalid): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificate(value: String): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    @scala.inline
    def setError(value: js.Object): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExpires(value: String): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setNotAfter(value: String): Self = this.set("notAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotAfter: Self = this.set("notAfter", js.undefined)
    @scala.inline
    def setNotBefore(value: String): Self = this.set("notBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotBefore: Self = this.set("notBefore", js.undefined)
  }
  
}

