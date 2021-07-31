package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenProvider extends StObject {
  
  var cacheTTLInSeconds: js.UndefOr[Double] = js.undefined
  
  var enableCache: js.UndefOr[Boolean] = js.undefined
}
object TokenProvider {
  
  @scala.inline
  def apply(): TokenProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenProvider]
  }
  
  @scala.inline
  implicit class TokenProviderMutableBuilder[Self <: TokenProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheTTLInSeconds(value: Double): Self = StObject.set(x, "cacheTTLInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheTTLInSecondsUndefined: Self = StObject.set(x, "cacheTTLInSeconds", js.undefined)
    
    @scala.inline
    def setEnableCache(value: Boolean): Self = StObject.set(x, "enableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCacheUndefined: Self = StObject.set(x, "enableCache", js.undefined)
  }
}
