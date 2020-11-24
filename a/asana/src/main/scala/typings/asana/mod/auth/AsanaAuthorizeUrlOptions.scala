package typings.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsanaAuthorizeUrlOptions extends js.Object {
  
  var asanaBaseUrl: js.UndefOr[String] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
}
object AsanaAuthorizeUrlOptions {
  
  @scala.inline
  def apply(): AsanaAuthorizeUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsanaAuthorizeUrlOptions]
  }
  
  @scala.inline
  implicit class AsanaAuthorizeUrlOptionsOps[Self <: AsanaAuthorizeUrlOptions] (val x: Self) extends AnyVal {
    
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
    def setAsanaBaseUrl(value: String): Self = this.set("asanaBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsanaBaseUrl: Self = this.set("asanaBaseUrl", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
  }
}
