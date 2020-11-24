package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proxy extends js.Object {
  
  /**
    * The default number of minutes allowed for proxy sessions.
    */
  var DefaultSessionExpiryMinutes: js.UndefOr[Integer] = js.native
  
  /**
    * When true, stops proxy sessions from being created on the specified Amazon Chime Voice Connector.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The phone number to route calls to after a proxy session expires.
    */
  var FallBackPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
  
  /**
    * The countries for proxy phone numbers to be selected from.
    */
  var PhoneNumberCountries: js.UndefOr[StringList] = js.native
}
object Proxy {
  
  @scala.inline
  def apply(): Proxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Proxy]
  }
  
  @scala.inline
  implicit class ProxyOps[Self <: Proxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultSessionExpiryMinutes(value: Integer): Self = this.set("DefaultSessionExpiryMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSessionExpiryMinutes: Self = this.set("DefaultSessionExpiryMinutes", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
    
    @scala.inline
    def setFallBackPhoneNumber(value: E164PhoneNumber): Self = this.set("FallBackPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallBackPhoneNumber: Self = this.set("FallBackPhoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneNumberCountriesVarargs(value: String*): Self = this.set("PhoneNumberCountries", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumberCountries(value: StringList): Self = this.set("PhoneNumberCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumberCountries: Self = this.set("PhoneNumberCountries", js.undefined)
  }
}
