package typings.acmeClient.rfc8555Mod

import typings.acmeClient.acmeClientStrings.deactivated
import typings.acmeClient.acmeClientStrings.revoked
import typings.acmeClient.acmeClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends js.Object {
  
  var contact: js.UndefOr[js.Array[String]] = js.native
  
  var externalAccountBinding: js.UndefOr[js.Object] = js.native
  
  var orders: String = js.native
  
  var status: valid | deactivated | revoked = js.native
  
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.native
}
object Account {
  
  @scala.inline
  def apply(orders: String, status: valid | deactivated | revoked): Account = {
    val __obj = js.Dynamic.literal(orders = orders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    
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
    def setOrders(value: String): Self = this.set("orders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: valid | deactivated | revoked): Self = this.set("status", value.asInstanceOf[js.Any])
    
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
    def setTermsOfServiceAgreed(value: Boolean): Self = this.set("termsOfServiceAgreed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermsOfServiceAgreed: Self = this.set("termsOfServiceAgreed", js.undefined)
  }
}
