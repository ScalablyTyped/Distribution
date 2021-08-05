package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return a value for a token.
  * Base for `ValueProvider` decorator.
  *
  * @publicApi
  */
trait ValueSansProvider extends StObject {
  
  /**
    * The value to inject.
    */
  var useValue: js.Any
}
object ValueSansProvider {
  
  inline def apply(useValue: js.Any): ValueSansProvider = {
    val __obj = js.Dynamic.literal(useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSansProvider]
  }
  
  extension [Self <: ValueSansProvider](x: Self) {
    
    inline def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
  }
}
