package typings.auth0Widget.mod

import typings.auth0Js.mod.AuthOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0Constructor extends AuthOptions {
  
  var assetsUrl: js.UndefOr[String] = js.native
  
  var cdn: js.UndefOr[String] = js.native
  
  var dict: js.UndefOr[js.Any] = js.native
}
object Auth0Constructor {
  
  @scala.inline
  def apply(clientID: String, domain: String): Auth0Constructor = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Constructor]
  }
  
  @scala.inline
  implicit class Auth0ConstructorOps[Self <: Auth0Constructor] (val x: Self) extends AnyVal {
    
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
    def setAssetsUrl(value: String): Self = this.set("assetsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetsUrl: Self = this.set("assetsUrl", js.undefined)
    
    @scala.inline
    def setCdn(value: String): Self = this.set("cdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdn: Self = this.set("cdn", js.undefined)
    
    @scala.inline
    def setDict(value: js.Any): Self = this.set("dict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDict: Self = this.set("dict", js.undefined)
  }
}
