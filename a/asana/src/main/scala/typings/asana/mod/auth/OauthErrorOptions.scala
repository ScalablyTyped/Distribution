package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthErrorOptions extends StObject {
  
  var error: js.UndefOr[String] = js.undefined
  
  var error_description: js.UndefOr[String] = js.undefined
  
  var error_uri: js.UndefOr[String] = js.undefined
}
object OauthErrorOptions {
  
  inline def apply(): OauthErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OauthErrorOptions]
  }
  
  extension [Self <: OauthErrorOptions](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
    
    inline def setError_descriptionUndefined: Self = StObject.set(x, "error_description", js.undefined)
    
    inline def setError_uri(value: String): Self = StObject.set(x, "error_uri", value.asInstanceOf[js.Any])
    
    inline def setError_uriUndefined: Self = StObject.set(x, "error_uri", js.undefined)
  }
}
