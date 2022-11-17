package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticClassSansProvider extends StObject {
  
  /**
    * A list of `token`s to be resolved by the injector. The list of values is then
    * used as arguments to the `useClass` constructor.
    */
  var deps: js.Array[Any]
  
  /**
    * An optional class to instantiate for the `token`. By default, the `provide`
    * class is instantiated.
    */
  var useClass: Type[Any]
}
object StaticClassSansProvider {
  
  inline def apply(deps: js.Array[Any], useClass: Type[Any]): StaticClassSansProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticClassSansProvider]
  }
  
  extension [Self <: StaticClassSansProvider](x: Self) {
    
    inline def setDeps(value: js.Array[Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsVarargs(value: Any*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setUseClass(value: Type[Any]): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
  }
}
