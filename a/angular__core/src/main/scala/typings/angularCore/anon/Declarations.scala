package typings.angularCore.anon

import typings.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Declarations extends StObject {
  
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
}
object Declarations {
  
  @scala.inline
  def apply(): Declarations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Declarations]
  }
  
  @scala.inline
  implicit class DeclarationsMutableBuilder[Self <: Declarations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclarations(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationsFunction0(value: () => js.Array[Type[_]]): Self = StObject.set(x, "declarations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    @scala.inline
    def setDeclarationsVarargs(value: Type[js.Any]*): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    @scala.inline
    def setExports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsFunction0(value: () => js.Array[Type[_]]): Self = StObject.set(x, "exports", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    @scala.inline
    def setExportsVarargs(value: Type[js.Any]*): Self = StObject.set(x, "exports", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsFunction0(value: () => js.Array[Type[_]]): Self = StObject.set(x, "imports", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: Type[js.Any]*): Self = StObject.set(x, "imports", js.Array(value :_*))
  }
}
