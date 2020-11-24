package typings.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthErrorOptions extends js.Object {
  
  var error: js.UndefOr[String] = js.native
  
  var error_description: js.UndefOr[String] = js.native
  
  var error_uri: js.UndefOr[String] = js.native
}
object OauthErrorOptions {
  
  @scala.inline
  def apply(): OauthErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OauthErrorOptions]
  }
  
  @scala.inline
  implicit class OauthErrorOptionsOps[Self <: OauthErrorOptions] (val x: Self) extends AnyVal {
    
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setError_description(value: String): Self = this.set("error_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError_description: Self = this.set("error_description", js.undefined)
    
    @scala.inline
    def setError_uri(value: String): Self = this.set("error_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError_uri: Self = this.set("error_uri", js.undefined)
  }
}
