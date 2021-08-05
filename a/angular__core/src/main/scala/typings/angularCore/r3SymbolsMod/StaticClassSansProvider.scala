package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return an instance of `useClass` for a token.
  * Base for `StaticClassProvider` decorator.
  *
  * @publicApi
  */
trait StaticClassSansProvider extends StObject {
  
  /**
    * A list of `token`s to be resolved by the injector. The list of values is then
    * used as arguments to the `useClass` constructor.
    */
  var deps: js.Array[js.Any]
  
  /**
    * An optional class to instantiate for the `token`. By default, the `provide`
    * class is instantiated.
    */
  var useClass: Type[js.Any]
}
object StaticClassSansProvider {
  
  inline def apply(deps: js.Array[js.Any], useClass: Type[js.Any]): StaticClassSansProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticClassSansProvider]
  }
  
  extension [Self <: StaticClassSansProvider](x: Self) {
    
    inline def setDeps(value: js.Array[js.Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    inline def setUseClass(value: Type[js.Any]): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
  }
}
