package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deps extends StObject {
  
  var deps: js.Array[Any]
  
  var useFactory: js.Function
}
object Deps {
  
  inline def apply(deps: js.Array[Any], useFactory: js.Function): Deps = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deps]
  }
  
  extension [Self <: Deps](x: Self) {
    
    inline def setDeps(value: js.Array[Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsVarargs(value: Any*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setUseFactory(value: js.Function): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
  }
}
