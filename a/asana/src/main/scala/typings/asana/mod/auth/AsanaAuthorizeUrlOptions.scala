package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsanaAuthorizeUrlOptions extends StObject {
  
  var asanaBaseUrl: js.UndefOr[String] = js.undefined
  
  var redirectUri: js.UndefOr[String] = js.undefined
}
object AsanaAuthorizeUrlOptions {
  
  inline def apply(): AsanaAuthorizeUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsanaAuthorizeUrlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsanaAuthorizeUrlOptions] (val x: Self) extends AnyVal {
    
    inline def setAsanaBaseUrl(value: String): Self = StObject.set(x, "asanaBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setAsanaBaseUrlUndefined: Self = StObject.set(x, "asanaBaseUrl", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}
