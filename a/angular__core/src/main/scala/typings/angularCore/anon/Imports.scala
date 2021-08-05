package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Imports extends StObject {
  
  def factory(): js.Any
  
  var imports: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var providers: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object Imports {
  
  inline def apply(factory: () => js.Any): Imports = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    __obj.asInstanceOf[Imports]
  }
  
  extension [Self <: Imports](x: Self) {
    
    inline def setFactory(value: () => js.Any): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    
    inline def setImports(value: js.Array[js.Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: js.Any*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    inline def setProviders(value: js.Array[js.Any]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: js.Any*): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
