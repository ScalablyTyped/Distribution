package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnlinkAccountsResponseProfile extends js.Object {
  
  var email: js.UndefOr[String] = js.native
  
  var email_verified: js.UndefOr[Boolean] = js.native
  
  var family_name: js.UndefOr[String] = js.native
  
  var given_name: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var phone_number: js.UndefOr[String] = js.native
  
  var phone_verified: js.UndefOr[Boolean] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object UnlinkAccountsResponseProfile {
  
  @scala.inline
  def apply(): UnlinkAccountsResponseProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnlinkAccountsResponseProfile]
  }
  
  @scala.inline
  implicit class UnlinkAccountsResponseProfileOps[Self <: UnlinkAccountsResponseProfile] (val x: Self) extends AnyVal {
    
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
    def setFamily_name(value: String): Self = this.set("family_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily_name: Self = this.set("family_name", js.undefined)
    
    @scala.inline
    def setGiven_name(value: String): Self = this.set("given_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGiven_name: Self = this.set("given_name", js.undefined)
    
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
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
