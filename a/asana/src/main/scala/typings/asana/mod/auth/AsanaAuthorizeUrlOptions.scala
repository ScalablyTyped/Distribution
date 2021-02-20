package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsanaAuthorizeUrlOptions extends StObject {
  
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
  implicit class AsanaAuthorizeUrlOptionsMutableBuilder[Self <: AsanaAuthorizeUrlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsanaBaseUrl(value: String): Self = StObject.set(x, "asanaBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsanaBaseUrlUndefined: Self = StObject.set(x, "asanaBaseUrl", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}
