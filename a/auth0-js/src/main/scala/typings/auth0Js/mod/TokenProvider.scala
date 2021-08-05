package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenProvider extends StObject {
  
  var cacheTTLInSeconds: js.UndefOr[Double] = js.undefined
  
  var enableCache: js.UndefOr[Boolean] = js.undefined
}
object TokenProvider {
  
  inline def apply(): TokenProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenProvider]
  }
  
  extension [Self <: TokenProvider](x: Self) {
    
    inline def setCacheTTLInSeconds(value: Double): Self = StObject.set(x, "cacheTTLInSeconds", value.asInstanceOf[js.Any])
    
    inline def setCacheTTLInSecondsUndefined: Self = StObject.set(x, "cacheTTLInSeconds", js.undefined)
    
    inline def setEnableCache(value: Boolean): Self = StObject.set(x, "enableCache", value.asInstanceOf[js.Any])
    
    inline def setEnableCacheUndefined: Self = StObject.set(x, "enableCache", js.undefined)
  }
}
