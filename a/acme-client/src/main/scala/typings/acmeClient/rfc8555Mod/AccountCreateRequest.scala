package typings.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountCreateRequest extends js.Object {
  
  var contact: js.UndefOr[js.Array[String]] = js.native
  
  var externalAccountBinding: js.UndefOr[js.Object] = js.native
  
  var onlyReturnExisting: js.UndefOr[Boolean] = js.native
  
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.native
}
object AccountCreateRequest {
  
  @scala.inline
  def apply(): AccountCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCreateRequest]
  }
  
  @scala.inline
  implicit class AccountCreateRequestOps[Self <: AccountCreateRequest] (val x: Self) extends AnyVal {
    
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
    def setExternalAccountBinding(value: js.Object): Self = this.set("externalAccountBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalAccountBinding: Self = this.set("externalAccountBinding", js.undefined)
    
    @scala.inline
    def setOnlyReturnExisting(value: Boolean): Self = this.set("onlyReturnExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyReturnExisting: Self = this.set("onlyReturnExisting", js.undefined)
    
    @scala.inline
    def setTermsOfServiceAgreed(value: Boolean): Self = this.set("termsOfServiceAgreed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermsOfServiceAgreed: Self = this.set("termsOfServiceAgreed", js.undefined)
  }
}
