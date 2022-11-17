package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistingSansProvider extends StObject {
  
  /**
    * Existing `token` to return. (Equivalent to `injector.get(useExisting)`)
    */
  var useExisting: Any
}
object ExistingSansProvider {
  
  inline def apply(useExisting: Any): ExistingSansProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingSansProvider]
  }
  
  extension [Self <: ExistingSansProvider](x: Self) {
    
    inline def setUseExisting(value: Any): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
  }
}
