package typings.atlaskitTokens.anon

import typings.atlaskitTokens.typesTypesMod.OpacityToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loading extends StObject {
  
  var disabled: OpacityToken
  
  var loading: OpacityToken
}
object Loading {
  
  inline def apply(disabled: OpacityToken, loading: OpacityToken): Loading = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loading]
  }
  
  extension [Self <: Loading](x: Self) {
    
    inline def setDisabled(value: OpacityToken): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: OpacityToken): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
  }
}
