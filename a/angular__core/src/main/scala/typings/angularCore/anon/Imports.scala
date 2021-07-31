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
  
  @scala.inline
  def apply(factory: () => js.Any): Imports = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    __obj.asInstanceOf[Imports]
  }
  
  @scala.inline
  implicit class ImportsMutableBuilder[Self <: Imports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactory(value: () => js.Any): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImports(value: js.Array[js.Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: js.Any*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[js.Any]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: js.Any*): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
