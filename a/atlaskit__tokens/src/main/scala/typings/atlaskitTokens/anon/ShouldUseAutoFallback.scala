package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShouldUseAutoFallback extends StObject {
  
  var shouldUseAutoFallback: js.UndefOr[Boolean] = js.undefined
}
object ShouldUseAutoFallback {
  
  inline def apply(): ShouldUseAutoFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShouldUseAutoFallback]
  }
  
  extension [Self <: ShouldUseAutoFallback](x: Self) {
    
    inline def setShouldUseAutoFallback(value: Boolean): Self = StObject.set(x, "shouldUseAutoFallback", value.asInstanceOf[js.Any])
    
    inline def setShouldUseAutoFallbackUndefined: Self = StObject.set(x, "shouldUseAutoFallback", js.undefined)
  }
}
