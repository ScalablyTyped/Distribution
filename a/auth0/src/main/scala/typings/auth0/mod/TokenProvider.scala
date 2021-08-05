package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenProvider extends StObject {
  
  var cacheTTLInSeconds: js.UndefOr[Double] = js.undefined
  
  var enableCache: Boolean
}
object TokenProvider {
  
  inline def apply(enableCache: Boolean): TokenProvider = {
    val __obj = js.Dynamic.literal(enableCache = enableCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenProvider]
  }
  
  extension [Self <: TokenProvider](x: Self) {
    
    inline def setCacheTTLInSeconds(value: Double): Self = StObject.set(x, "cacheTTLInSeconds", value.asInstanceOf[js.Any])
    
    inline def setCacheTTLInSecondsUndefined: Self = StObject.set(x, "cacheTTLInSeconds", js.undefined)
    
    inline def setEnableCache(value: Boolean): Self = StObject.set(x, "enableCache", value.asInstanceOf[js.Any])
  }
}
