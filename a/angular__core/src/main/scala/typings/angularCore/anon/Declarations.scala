package typings.angularCore.anon

import typings.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Declarations extends StObject {
  
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.UndefOr[js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]] = js.undefined
  
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.UndefOr[js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]] = js.undefined
  
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.UndefOr[js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]] = js.undefined
}
object Declarations {
  
  inline def apply(): Declarations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Declarations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Declarations] (val x: Self) extends AnyVal {
    
    inline def setDeclarations(value: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsFunction0(value: () => js.Array[Type[Any]]): Self = StObject.set(x, "declarations", js.Any.fromFunction0(value))
    
    inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    inline def setDeclarationsVarargs(value: Type[Any]*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setExports(value: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsFunction0(value: () => js.Array[Type[Any]]): Self = StObject.set(x, "exports", js.Any.fromFunction0(value))
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: Type[Any]*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setImports(value: js.Array[Type[Any]] | js.Function0[js.Array[Type[Any]]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsFunction0(value: () => js.Array[Type[Any]]): Self = StObject.set(x, "imports", js.Any.fromFunction0(value))
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: Type[Any]*): Self = StObject.set(x, "imports", js.Array(value*))
  }
}
