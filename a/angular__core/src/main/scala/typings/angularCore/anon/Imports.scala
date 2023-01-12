package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Imports extends StObject {
  
  var imports: js.UndefOr[js.Array[Any]] = js.undefined
  
  var providers: js.UndefOr[js.Array[Any]] = js.undefined
}
object Imports {
  
  inline def apply(): Imports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Imports]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Imports] (val x: Self) extends AnyVal {
    
    inline def setImports(value: js.Array[Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: Any*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setProviders(value: js.Array[Any]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: Any*): Self = StObject.set(x, "providers", js.Array(value*))
  }
}
