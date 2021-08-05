package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return a value by invoking a `useClass` function.
  * Base for `ClassProvider` decorator.
  *
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @publicApi
  */
trait ClassSansProvider extends StObject {
  
  /**
    * Class to instantiate for the `token`.
    */
  var useClass: Type[js.Any]
}
object ClassSansProvider {
  
  inline def apply(useClass: Type[js.Any]): ClassSansProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSansProvider]
  }
  
  extension [Self <: ClassSansProvider](x: Self) {
    
    inline def setUseClass(value: Type[js.Any]): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
  }
}
