package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return a value of another `useExisting` token.
  *
  * @see `ExistingProvider`
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @publicApi
  */
trait ExistingSansProvider extends StObject {
  
  /**
    * Existing `token` to return. (Equivalent to `injector.get(useExisting)`)
    */
  var useExisting: js.Any
}
object ExistingSansProvider {
  
  inline def apply(useExisting: js.Any): ExistingSansProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingSansProvider]
  }
  
  extension [Self <: ExistingSansProvider](x: Self) {
    
    inline def setUseExisting(value: js.Any): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
  }
}
