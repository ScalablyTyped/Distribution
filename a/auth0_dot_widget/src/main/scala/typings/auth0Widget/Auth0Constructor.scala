package typings.auth0Widget

import typings.auth0Js.mod.AuthOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0Constructor
  extends StObject
     with AuthOptions {
  
  var assetsUrl: js.UndefOr[String] = js.undefined
  
  var cdn: js.UndefOr[String] = js.undefined
  
  var dict: js.UndefOr[Any] = js.undefined
}
object Auth0Constructor {
  
  inline def apply(clientID: String, domain: String): Auth0Constructor = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Constructor]
  }
  
  extension [Self <: Auth0Constructor](x: Self) {
    
    inline def setAssetsUrl(value: String): Self = StObject.set(x, "assetsUrl", value.asInstanceOf[js.Any])
    
    inline def setAssetsUrlUndefined: Self = StObject.set(x, "assetsUrl", js.undefined)
    
    inline def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
    
    inline def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
    
    inline def setDict(value: Any): Self = StObject.set(x, "dict", value.asInstanceOf[js.Any])
    
    inline def setDictUndefined: Self = StObject.set(x, "dict", js.undefined)
  }
}
